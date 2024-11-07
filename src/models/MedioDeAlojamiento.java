package models;

public class MedioDeAlojamiento {
    protected int valorBaseNohe;
    protected DatosClientes datosClientes;
    protected String tipoDeTemporada;
    protected int cantidadNoches;

    public MedioDeAlojamiento(int valorBaseNohe, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches) {
        this.valorBaseNohe = valorBaseNohe;
        this.datosClientes = datosClientes;
        this.tipoDeTemporada = tipoDeTemporada;
        this.cantidadNoches = cantidadNoches;
    }

    public int getValorBaseNohe() {
        return valorBaseNohe;
    }

    public void setValorBaseNohe(int valorBaseNohe) {
        this.valorBaseNohe = valorBaseNohe;
    }

    public DatosClientes getDatosClientes() {
        return datosClientes;
    }

    public void setDatosClientes(DatosClientes datosClientes) {
        this.datosClientes = datosClientes;
    }

    public String getTipoDeTemporada() {
        return tipoDeTemporada;
    }

    public void setTipoDeTemporada(String tipoDeTemporada) {
        this.tipoDeTemporada = tipoDeTemporada;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }
}
