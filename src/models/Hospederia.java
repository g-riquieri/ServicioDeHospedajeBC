package models;

public abstract class Hospederia {
    int capacidad;
    String tipoDeTemporada;
    int cantidadNoches;
    boolean esFumador;

    public Hospederia(int capacidad, String tipoDeTemporada, int cantidadNoches, boolean esFumador) {
        this.capacidad = capacidad;
        this.tipoDeTemporada = tipoDeTemporada;
        this.cantidadNoches = cantidadNoches;
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }
}
