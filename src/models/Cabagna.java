package models;

public class Cabagna extends MedioDeAlojamiento {
    protected boolean esFumador;
    protected int cantPersonas;
    boolean chimenea;

    public Cabagna(int valorBaseNoche, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches, boolean esFumador, int cantPersonas, boolean chimenea) {
        super(valorBaseNoche, datosClientes, tipoDeTemporada, cantidadNoches);
        this.esFumador = esFumador;
        this.cantPersonas = cantPersonas;
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    @Override
    public double adicional() {
        return 0;
    }

    public void incrementaValorBase() {
        if (cantPersonas > 5) {
            valorBaseNoche *= 1.18;
        }
    }
}
