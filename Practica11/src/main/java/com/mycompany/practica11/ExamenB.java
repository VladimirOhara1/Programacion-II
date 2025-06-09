/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 
    public void incrementarPrecio(double x) { 
        this.precio += x; 
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
    Artista a1, a2; 
    Anuncio anuncio; 
 
    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) { 
        this.titulo = titulo; 
        this.material = material; 
        this.a1 = a1; 
        this.a2 = a2; 
        this.anuncio = anuncio; 
    } 
 
    public Artista[] getArtistas() { 
        return new Artista[]{a1, a2}; 
    } 
 
    public Anuncio getAnuncio() { 
        return anuncio; 
    } 
}
class Pintura extends Obra { 
    String genero; 
 
    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String 
genero) { 
        super(titulo, material, a1, a2, anuncio); 
        this.genero = genero; 
    } 
}
public class ExamenB {
    
}
