package view;

import models.DatosClientes;
import models.Hotel;
import models.MedioDeAlojamiento;

public class App {
    public static void main(String[] args) {
        DatosClientes data = new DatosClientes("Carlos", 12345);
        MedioDeAlojamiento mda = new MedioDeAlojamiento(65000,data,"Alta",3);
        Hotel hotel = new Hotel(56000,data,"Alta",3,4,true, true);

        System.out.println(mda.getCantidadNoches());
        System.out.println(mda.getValorBaseNoche());
        System.out.println(mda.getDatosClientes());
        System.out.println(mda.getTipoDeTemporada());

        System.out.println("El sub total a es: "+mda.subtotal());
        System.out.println(hotel.subtotal());
    }
}
