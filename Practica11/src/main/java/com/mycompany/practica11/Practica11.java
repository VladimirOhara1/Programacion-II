package com.mycompany.practica11;

/**
 *
 * @author Usuario
 */
class Anuncio {

    int numero;
    double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}

class Artista {

    String nombre;
    String ci;
    int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }
}

class Obra {

    String titulo;
    String material;
    Artista a1;
    Artista a2;
    Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }

    public Artista getArtistaMasExperto() {
        return (a1.getAñosExperiencia() > a2.getAñosExperiencia()) ? a1 : a2;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public double getPrecio() {
        return (anuncio != null) ? anuncio.getPrecio() : 0;
    }
}

class Pintura extends Obra {

    String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String genero) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }
}

public class Practica11 {

    public static void main(String[] args) {

        Artista artista1 = new Artista("Ana", "123", 10);
        Artista artista2 = new Artista("Luis", "456", 5);
        Artista artista3 = new Artista("Clara", "789", 8);
        Artista artista4 = new Artista("Carlos", "321", 12);

        Anuncio anuncio1 = new Anuncio(1, 1500);
        Pintura pinturaConAnuncio = new Pintura("Sol", "óleo", artista1, artista2, anuncio1,
                "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Luna", "acrílico", artista3, artista4, null,
                "Abstracto");

        Artista experto1 = pinturaConAnuncio.getArtistaMasExperto();
        Artista experto2 = pinturaSinAnuncio.getArtistaMasExperto();
        Artista masExperto = (experto1.getAñosExperiencia()
                > experto2.getAñosExperiencia()) ? experto1 : experto2;

        System.out.println("Artista con más experiencia: " + masExperto.getNombre());

        Anuncio anuncio2 = new Anuncio(2, 1800);
        pinturaSinAnuncio.setAnuncio(anuncio2);

        double total = pinturaConAnuncio.getPrecio() + pinturaSinAnuncio.getPrecio();
        System.out.println("Monto total de venta: " + total);

    }
}
