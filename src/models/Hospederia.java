package models;

public abstract class Hospederia extends MedioDeAlojamiento {
    int capacidad;
    boolean esFumador;

    public Hospederia(int valorBaseNohe, DatosClientes datosClientes, String tipoDeTemporada, int cantidadNoches, int capacidad, String tipoDeTemporada1, int cantidadNoches1, boolean esFumador) {
        super(valorBaseNohe, datosClientes, tipoDeTemporada, cantidadNoches);
        this.capacidad = capacidad;
        this.tipoDeTemporada = tipoDeTemporada1;
        this.cantidadNoches = cantidadNoches1;
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }
}
