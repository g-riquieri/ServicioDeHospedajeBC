package models;

public abstract class MedioDeAlojamiento {
    protected int valorBaseNoche;
    protected DatosClientes datosClientes;
    protected String tipoDeTemporada;
    protected int cantidadNoches;

    public MedioDeAlojamiento(int valorBaseNoche, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches) {
        this.valorBaseNoche = valorBaseNoche;
        this.datosClientes = datosClientes;
        this.tipoDeTemporada = tipoDeTemporada;
        this.cantidadNoches = cantidadNoches;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNohe(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
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

    public int subtotal(){
        int subtotal = this.getCantidadNoches() * this.getValorBaseNoche() ;

        return subtotal;
    }

    public abstract double adicional();

    public double bonoDescuento() {
        double subtotal = subtotal();
        if (tipoDeTemporada.equalsIgnoreCase("baja")) {
            return subtotal * 25/100;
        } else if (tipoDeTemporada.equalsIgnoreCase("media")) {
            return subtotal * 12.5/100;
        } else {
            return 0;
        }
    }


    public double valorACancelar() {
        return subtotal() - bonoDescuento() + adicional();
    }


}
