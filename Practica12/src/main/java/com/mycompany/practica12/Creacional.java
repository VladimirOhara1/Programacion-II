package com.mycompany.practica12;
/**
 *
 * @author Usuario
 */
public class Creacional {
    private static Creacional instancia;

    private Creacional() {
        // Constructor privado
    }

    public static Creacional getInstancia() {
        if (instancia == null) {
            instancia = new Creacional();
        }
        return instancia;
    }

    public void log(String mensaje) {
        System.out.println("LOG: " + mensaje);
    }
}
