package view;

import controllers.Controller;
import models.DatosClientes;
import models.Hotel;
import models.Cabagna;

import java.util.Scanner;

public class App {
    private Controller controlador;
    private Scanner scanner;

    public App() {
        this.controlador = new Controller();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú de Gestión de Alojamientos ---");
            System.out.println("1. Agregar Alojamiento");
            System.out.println("2. Mostrar Alojamientos");
            System.out.println("3. Mostrar Alojamiento de un Cliente");
            System.out.println("4. Calcular Total Adicional");
            System.out.println("5. Calcular Total Bono Descuento");
            System.out.println("6. Calcular Valor a Cancelar por un Cliente");
            System.out.println("7. Aplicar Incremento en Valor Base");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: controlador.agregarAlojamiento(); break;
                case 2: controlador.mostrarAlojamientos(); break;
                case 3: controlador.mostrarAlojamientoCliente(); break;
                case 4: controlador.calcularTotalAdicional(); break;
                case 5: controlador.calcularTotalBonoDescuento(); break;
                case 6: controlador.calcularValorACancelarCliente(); break;
                case 7: controlador.aplicarIncrementoValorBase(); break;
                case 8: salir = true; System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

