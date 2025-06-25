package sv.gob.fgr.modelos;

public class DerechosAsientoModelo {

    private String codigoComunes;
    private String nombreTitular;
    private int correlativoNombre;
    private String derecho;
    private int asiento;
    private int porcentajeDerecho;
    private String desde;
    
    public DerechosAsientoModelo(){}

    public String getCodigoComunes() {
        return codigoComunes;
    }
    public void setCodigoComunes(String codigoComunes) {
        this.codigoComunes = codigoComunes;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public int getCorrelativoNombre() {
        return correlativoNombre;
    }
    public void setCorrelativoNombre(int correlativoNombre) {
        this.correlativoNombre = correlativoNombre;
    }
    public String getDerecho() {
        return derecho;
    }
    public void setDerecho(String derecho) {
        this.derecho = derecho;
    }
    public int getAsiento() {
        return asiento;
    }
    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    public int getPorcentajeDerecho() {
        return porcentajeDerecho;
    }
    public void setPorcentajeDerecho(int porcentajeDerecho) {
        this.porcentajeDerecho = porcentajeDerecho;
    }
    public String getDesde() {
        return desde;
    }
    public void setDesde(String desde) {
        this.desde = desde;
    }

    

}
