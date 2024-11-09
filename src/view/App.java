package view;

import models.DatosClientes;
import models.Hotel;
import models.MedioDeAlojamiento;

public class App {
    public static void main(String[] args) {
        DatosClientes data = new DatosClientes("Carlos", 12345);
        Hotel hotel = new Hotel(56000,data,"media",6,5,true,true,8);


        System.out.println(hotel.adicional());
        System.out.println(hotel.bonoDescuento());
        System.out.println(hotel.valorACancelar());
    }
}
