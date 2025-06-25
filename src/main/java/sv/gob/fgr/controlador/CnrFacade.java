package sv.gob.fgr.controlador;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import sv.gob.fgr.servicios.CnrFacadeServicios;

@Path("/services")
public class CnrFacade {

    @Inject
    CnrFacadeServicios cnrFacServ;

    @GET
    @Path("/hola")
    @Produces(MediaType.APPLICATION_JSON)
    public String Hola() {
        return "Un gusto, consumo exitoso de Servicio Restful en Quarkus";
    }

    @GET
    @Path("/derechoAsiento/{presente}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response derechoAsiento(@PathParam("presente") String presente) {
        return cnrFacServ.derechoAsiento(presente);
    }

    @GET
    @Path("/asientos/{matricula}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response asientos(@PathParam("matricula") String matricula) {
        return cnrFacServ.asiento(matricula);
    }
}
