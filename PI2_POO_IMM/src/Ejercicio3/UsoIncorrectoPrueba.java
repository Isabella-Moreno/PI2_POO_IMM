package Ejercicio3;

public class UsoIncorrectoPrueba {

    public void iniciar() {

        CuentaSimple cuenta = new CuentaSimple("Isabella");


        System.out.println("--- PUNTO 1: ERROR DE COMPILACIÓN ---");
        System.out.println("Al intentar acceder a 'cuenta.titular' desde otra clase, el compilador bloquea la ejecución "
                + "con el error: 'titular has private access in Ejercicio3.CuentaSimple'.");


        CajaFuerte caja = new CajaFuerte("1234");

        System.out.println("\n--- PUNTO 2: DISCUSIÓN SOBRE PROTECCIÓN DE DATOS ---");
        System.out.println("1. Protección extrema (aislamiento total): El dato queda completamente oculto e inmutable "
                + "desde el exterior después de instanciar el objeto, impidiendo cualquier alteración indebida.");
        System.out.println("2. Pérdida de operatividad y control: Al no existir getters ni setters con validaciones, "
                + "el objeto no puede exponer información de forma segura ni permitir actualizaciones controladas, "
                + "volviendo el atributo inútil para interactuar con el resto del sistema.");
    }
}