package models;

public class Cabagna extends Hospederia {
    boolean chimenea;

    public Cabagna(int valorBaseNohe, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches, int capacidad, String tipoDeTemporada1, int cantidadNoches1, boolean esFumador, boolean chimenea) {
        super(valorBaseNohe, datosClientes, tipoDeTemporada, cantidadNoches, capacidad, tipoDeTemporada1, cantidadNoches1, esFumador);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }
}
