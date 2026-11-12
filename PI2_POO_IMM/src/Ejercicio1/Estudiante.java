package Ejercicio1;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad inválida (" + edad + ").");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota debe estar entre 0.0 y 5.0.");
        }
    }
}