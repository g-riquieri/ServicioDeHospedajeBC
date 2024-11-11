package view;

import controllers.Controller;
import models.DatosClientes;
import models.Hotel;
import models.Cabagna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Ingresar Medio de Alojamiento");
            System.out.println("2. Mostrar Medios de Alojamiento");
            System.out.println("3. Datos de un Cliente");
            System.out.println("4. Total Adicional");
            System.out.println("5. Total Bono Descuento");
            System.out.println("6. Cantidad de Medios de Alojamiento");
            System.out.println("7. Valor a Cancelar por un Cliente");
            System.out.println("8. Aplicar Incremento del Valor Base");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarMedioAlojamiento(controller, scanner);
                    break;
                case 2:
                    controller.mostrarAlojamientos();
                    break;
                case 3:
                    mostrarDatosCliente(controller, scanner);
                    break;
                case 4:
                    System.out.println("Total Adicional: " + controller.calcularTotalAdicional());
                    break;
                case 5:
                    System.out.println("Total Bono Descuento: " + controller.calcularTotalBonoDescuento());
                    break;
                case 6:
                    System.out.println("Cantidad de Medios de Alojamiento: " + controller.getCantidadAlojamientos());
                    break;
                case 7:
                    calcularValorACancelar(controller, scanner);
                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void ingresarMedioAlojamiento(Controller controladora, Scanner scanner) {
        System.out.println("Ingrese tipo de alojamiento (1: Carpa, 2: Cabaña, 3: Hotel): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        System.out.print("Nombre del Cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("RUT del Cliente: ");
        String rut = scanner.nextLine();
        DatosClientes cliente = new DatosClientes(nombre, rut);

        System.out.print("Cantidad de Noches: ");
        int cantidadNoches = scanner.nextInt();
        System.out.print("Valor Base por Noche: ");
        double valorBaseNoche = scanner.nextDouble();
        System.out.print("Tipo de Temporada (alta, media, baja): ");
        String tipoTemporada = scanner.next();

        if (tipo == 1) {
            System.out.print("Cantidad de Personas: ");
            int cantidadPersonas = scanner.nextInt();
            Carpa carpa = new Carpa(cliente, cantidadNoches, valorBaseNoche, tipoTemporada, cantidadPersonas);
            controladora.agregarAlojamiento(carpa);
        } else if (tipo == 2) {
            System.out.print("Capacidad de la Cabaña: ");
            int capacidad = scanner.nextInt();
            System.out.print("¿Es Fumador? (true/false): ");
            boolean esFumador = scanner.nextBoolean();
            System.out.print("¿Tiene Chimenea? (true/false): ");
            boolean chimenea = scanner.nextBoolean();
            Cabagna cabagna = new Cabagna(cliente, cantidadNoches, valorBaseNoche, tipoTemporada, capacidad, esFumador, chimenea);
            controladora.agregarAlojamiento(cabagna);
        } else if (tipo == 3) {
            System.out.print("Capacidad del Hotel: ");
            int capacidad = scanner.nextInt();
            System.out.print("¿Es Fumador? (true/false): ");
            boolean esFumador = scanner.nextBoolean();
            System.out.print("¿Con Desayuno? (true/false): ");
            boolean conDesayuno = scanner.nextBoolean();
            Hotel hotel = new Hotel(cliente, cantidadNoches, valorBaseNoche, tipoTemporada, esFumador, conDesayuno, capacidad);
            controladora.agregarAlojamiento(hotel);
        } else {
            System.out.println("Tipo de alojamiento no válido.");
        }
    }

    private static void mostrarDatosCliente(Controller controladora, Scanner scanner) {
        System.out.print("Ingrese el RUT del cliente: ");
        String rut = scanner.next();
        controladora.mostrarDatosCliente(rut);
    }

    private static void calcularValorACancelar(Controller controladora, Scanner scanner) {
        System.out.print("Ingrese el RUT del cliente: ");
        String rut = scanner.next();
        double valor = controladora.calcularValorACancelarCliente(rut);
        if (valor != -1) {
            System.out.println("Valor a Cancelar: " + valor);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}

