package models;

public class Cabagna extends Hospederia {
    boolean chimenea;

    public Cabagna(int valorBaseNoche, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches, int capacidad, boolean esFumador, boolean chimenea) {
        super(valorBaseNoche, datosClientes, tipoDeTemporada, cantidadNoches, capacidad, esFumador);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }
}
