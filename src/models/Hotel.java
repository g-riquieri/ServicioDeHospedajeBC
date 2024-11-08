package models;

public class Hotel extends Hospederia {
    boolean conDesayuno;

    public Hotel(int valorBaseNohe, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches, int capacidad, String tipoDeTemporada1, int cantidadNoches1, boolean esFumador, boolean conDesayuno) {
        super(valorBaseNohe, datosClientes, tipoDeTemporada, cantidadNoches, capacidad, tipoDeTemporada1, cantidadNoches1, esFumador);
        this.conDesayuno = conDesayuno;
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }
}
