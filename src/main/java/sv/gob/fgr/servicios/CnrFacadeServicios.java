package sv.gob.fgr.servicios;

import java.util.List;
import java.util.function.Supplier;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import sv.gob.fgr.restClient.CnrServices;

@ApplicationScoped
public class CnrFacadeServicios {

    @Inject
    @RestClient
    CnrServices cnrServ;

    public Response derechoAsiento(String presente) {
        return ejecutarLlamadaRemota(() -> cnrServ.rprhDerechoAsiento(presente), presente);
    }

    public Response asiento(String matricula) {
        return ejecutarLlamadaRemota(() -> cnrServ.rprhAsiento(matricula), matricula);
    }


    private <T> Response ejecutarLlamadaRemota(Supplier<List<T>> llamada, String contexto) {
        try {
            List<T> resultados = llamada.get();

            if (resultados == null || resultados.isEmpty()) {
                return Response.status(Response.Status.NO_CONTENT).build(); // 204
            }

            return Response.ok(resultados).build(); // 200 OK
        } catch (WebApplicationException e) {
            int statusCode = e.getResponse().getStatus();

            if (statusCode == 400) {
                return Response.status(Response.Status.BAD_REQUEST)
                            .entity("[" + contexto + "] Error 400 (Bad Request): " + e.getMessage())
                            .build();
            } else {
                return Response.status(statusCode)
                            .entity("[" + contexto + "] Error remoto (HTTP " + statusCode + "): " + e.getMessage())
                            .build();
            }
        } catch (ProcessingException e) {
            return Response.status(Response.Status.BAD_GATEWAY)
                        .entity("[" + contexto + "] Error al comunicarse con el servicio remoto: " + e.getMessage())
                        .build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                        .entity("[" + contexto + "] Error inesperado: " + e.getMessage())
                        .build();
        }
    }


}
