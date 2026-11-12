package Ejercicio2;

import java.util.Scanner;

public class CochePrueba {

    private Coche coche;
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Marca del coche: ");
        String marca = sc.nextLine();

        System.out.print("Modelo del coche: ");
        String modelo = sc.nextLine();

        System.out.print("Velocidad máxima inicial (km/h): ");
        double velocidad = sc.nextDouble();

        coche = new Coche(marca, modelo, velocidad);

        mostrarDatos();
        verificarDatos();
        mostrarDatos();
    }

    private void mostrarDatos() {
        System.out.println("\nCoche: " + coche.getMarca()
                + " | Modelo: " + coche.getModelo()
                + " | Velocidad Máxima: " + coche.getVelocidadMaxima() + " km/h");
    }

    private void verificarDatos() {
        System.out.println("\nEscriba 1 si desea acelerar el coche"
                + "\nEscriba 2 si no desea realizar cambios");
        int opcion = sc.nextInt();

        while (opcion < 1 || opcion > 2) {
            System.out.println("\nSeleccione una de las dos opciones válidas:");
            opcion = sc.nextInt();
        }

        if (opcion == 1) {
            System.out.print("Ingrese el incremento de velocidad (km/h): ");
            coche.acelerar(sc.nextDouble());
        }
    }
}