package controllers;
import models.Cabagna;
import models.MedioDeAlojamiento;
import java.util.ArrayList;
import java.util.List;
public class Controller {
    private List<MedioDeAlojamiento> alojamientos;

    public Controller() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(MedioDeAlojamiento alojamiento) {
        for (MedioDeAlojamiento a : alojamientos) {
            String rutA = String.valueOf(a.getDatosClientes().getRut());
            String rutB = String.valueOf(alojamiento.getDatosClientes().getRut());

            if (rutA != null && rutA.equals(rutB)) {
                System.out.println("El cliente ya tiene un alojamiento.");
                return;
            }
        }
        alojamientos.add(alojamiento);
    }

    public void mostrarAlojamientos() {
        for (MedioDeAlojamiento a : alojamientos) {
            System.out.println(a.toString());
        }
    }

    public void mostrarDatosCliente(String rut) {
        for (MedioDeAlojamiento a : alojamientos) {
            if (a.getDatosClientes() != null && String.valueOf(a.getDatosClientes().getRut()).equals(rut)) {
                System.out.println(a.toString());
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }


    public double calcularTotalAdicional() {
        double total = 0;
        for (MedioDeAlojamiento a : alojamientos) {
            total += a.adicional();
        }
        return total;
    }

    public double calcularTotalBonoDescuento() {
        double total = 0;
        for (MedioDeAlojamiento a : alojamientos) {
            total += a.bonoDescuento();
        }
        return total;
    }

    // Función para obtener la cantidad de alojamientos
    public int getCantidadAlojamientos() {
        return alojamientos.size();
    }


}
