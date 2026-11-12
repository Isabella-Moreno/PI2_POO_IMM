package Ejercicio1;

import  java.util.Scanner;

public class EstudiantePrueba {

    private Estudiante estudiante;
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Nota promedio: ");
        double nota = sc.nextDouble();

        estudiante = new Estudiante(nombre, edad, nota);



        mostrarDatos();

        verificarDatos();

        mostrarDatos();

    }

    private void mostrarDatos() {
        System.out.println("\nEstudiante: " + estudiante.getNombre()
                + " | Edad: " + estudiante.getEdad()
                + " | Nota: " + estudiante.getNotaPromedio());
    }

    private void verificarDatos(){
        System.out.println("\n escriba 1 si desea actualizar algun dato" +
                "\n escriba 2 si no desea actualizar algun dato");
        int opcion = sc.nextInt();

        while  (opcion < 1 || opcion > 2){
            System.out.println("\n seleccione una de las dos opciones opcion");
            opcion = sc.nextInt();
        }


        if (opcion == 1){
            System.out.print("Nueva Edad: ");
            estudiante.setEdad(sc.nextInt());

            System.out.print("Nuevo promedio: ");
            estudiante.setNotaPromedio(sc.nextDouble());

        }

    }
}
