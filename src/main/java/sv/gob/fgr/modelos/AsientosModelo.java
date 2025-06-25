package sv.gob.fgr.modelos;

public class AsientosModelo {

    private int correlativoAsiento;
    private int numeroAsiento;
    private String clasificacion;
    private String servicio;
    private String presentacion;
    private String fechaPresentacion;
    private String fechaInscripcion;
    
    public AsientosModelo(){}

    public int getCorrelativoAsiento() {
        return correlativoAsiento;
    }
    public void setCorrelativoAsiento(int correlativoAsiento) {
        this.correlativoAsiento = correlativoAsiento;
    }
    public int getNumeroAsiento() {
        return numeroAsiento;
    }
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getPresentacion() {
        return presentacion;
    }
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    public String getFechaPresentacion() {
        return fechaPresentacion;
    }
    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }
    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    

}
