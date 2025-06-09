package com.mycompany.practica12;
import java.util.*;
/**
 *
 * @author Vladimir Ohara
 */
class EnchufeEuropeo {
    public void conectar() {
        System.out.println("Conectado a enchufe europeo.");
    }
}

// Adaptador
interface EnchufeAmericano {
    void conectar();
}

class AdaptadorEuropeo implements EnchufeAmericano {
    private EnchufeEuropeo europeo;

    public AdaptadorEuropeo(EnchufeEuropeo europeo) {
        this.europeo = europeo;
    }

    public void conectar() {
        europeo.conectar();
    }
}
interface Observador {
    void actualizar(String estado);
}

class Usuario implements Observador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String estado) {
        System.out.println(nombre + " recibió actualización: " + estado);
    }
}

class Canal {
    private List<Observador> suscriptores = new ArrayList<>();

    public void suscribir(Observador o) {
        suscriptores.add(o);
    }

    public void subirVideo(String titulo) {
        for (Observador o : suscriptores) {
            o.actualizar("Nuevo video: " + titulo);
        }
    }
}

public class Practica12 {

    public static void main(String[] args) {
        System.out.println("----Patrones Creacionales----");
        Creacional logger1 = Creacional.getInstancia();
        Creacional logger2 = Creacional.getInstancia();
        logger1.log("Este es un mensaje de prueba");
        System.out.println(logger1 == logger2); 
        
        
        System.out.println("----Patrones Estrucurales----");
         EnchufeEuropeo europeo = new EnchufeEuropeo();
        EnchufeAmericano adaptado = new AdaptadorEuropeo(europeo);
        adaptado.conectar();
        
        
        System.out.println("----Patrones de Comportamiento----");
        Canal canal = new Canal();
        Usuario ana = new Usuario("Ana");
        Usuario pedro = new Usuario("Pedro");

        canal.suscribir(ana);
        canal.suscribir(pedro);

        canal.subirVideo("Patrón Observer en Java");
    }
}
