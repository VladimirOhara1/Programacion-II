package com.mycompany.practica9;

/**
 *
 * @author Vladimir Ohara
 */
class Figura {

    String color;

    public Figura(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Figura [color=" + color + "]";
    }
}

class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }

    public String toString() {
        return "Circulo [radio=" + this.radio + "]";
    }
}

class Rectangulo extends Figura {

    private double ancho, alto;

    public Rectangulo(double ancho, double alto, String color) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getArea() {
        return this.ancho * this.alto;
    }
}

public class Practica9 {

    public static void despliegaObjeto(Figura f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        despliegaObjeto(new Circulo(2, "Rojo"));
        despliegaObjeto(new Rectangulo(2, 3, "Azul"));
        Figura figuras[] = new Figura[2];
        figuras[0] = new Circulo(3, "Verde");
        figuras[1] = new Rectangulo(3, 4, "Naranja");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
        }
        System.out.println("----Ejercicio2----");
        C2 o = new C2();
        System.out.println(o);
        System.out.println("----Ejercicio 3----");
        
      /*  EstudianteTrabajador et = new EstudianteTrabajador("Juan",55555, 100, 2000)
        System.out.println(et);*/

    }

}
