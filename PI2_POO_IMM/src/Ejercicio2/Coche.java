package Ejercicio2;

public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad máxima incrementada en " + incremento + " km/h.");
        } else {
            System.out.println("Error: El incremento debe ser un valor positivo.");
        }
    }
}