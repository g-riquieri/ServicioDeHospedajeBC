package view;

import models.DatosClientes;
import models.MedioDeAlojamiento;

public class App {
    public static void main(String[] args) {
        DatosClientes data = new DatosClientes("Carlos", 12345);

        MedioDeAlojamiento mda = new MedioDeAlojamiento(65000,data,"Alta",3);

        System.out.println(mda.getCantidadNoches());
        System.out.println(mda.getValorBaseNohe());
        System.out.println(mda.getDatosClientes());
        System.out.println(mda.getTipoDeTemporada());

        System.out.println("El sub total a pagar es: "+mda.subtotal());
    }
}
