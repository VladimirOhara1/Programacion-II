package com.mycompany.practica7;

/**
 *
 * @author Vladimir Ohara
 */
class Vehiculo {

    public String marca;
    public String modelo;
    public int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Año: %s",
                this.marca, this.modelo, this.año);
    }
}

class Coche extends Vehiculo {

    public int numero_puertas;

    public Coche(String marca, String modelo, int año, int numero_puertas) {
        super(marca, modelo, año);
        this.numero_puertas = numero_puertas;
    }

    public String toString() {
        String datos = super.toString();
        return String.format("Coche:\n%s\nNúmero de puertas: %d", datos,
                this.numero_puertas);
    }
}

class Motocicleta extends Vehiculo {

    public String tipo_motor;

    public Motocicleta(String marca, String modelo, int año, String tipo_motor) {
        super(marca, modelo, año);
        this.tipo_motor = tipo_motor;
    }

    public String toString() {
        String datos = super.toString();
        return String.format("Motocicleta:\n%s\nTipo de motor: %s",
                datos, this.tipo_motor);
    }
}
// Ejercicio 2

class Figura {

    String color;

    protected Figura() {
        this.color = "blanco";
    }

    public Figura(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Figura [color=" + color + "]";
    }

    public abstract double getArea();
    public abstract double getPerimetro();
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

    public double getDiametro() {
        return 2 * this.radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * this.radio * Math.PI;
    }

    public String toString() {
        return "Circulo: " + super.toString() + ", radio = "
                + this.radio;
    }

}

class Rectangulo extends Figura {

    private double ancho, alto;

    public Rectangulo(double ancho, double alto, String color) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return this.ancho * this.alto;
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.ancho + this.alto);
    }
}
//herencia

class Persona {

    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Empleado extends Persona {

    public float salario;

    public Empleado(String nombre, float salario) {
        super(nombre);
        this.salario = salario;
    }

    public String toString() {
        return this.nombre + " Salario: " + this.salario;
    }
}

class Estudiante extends Persona {

    public int matricula;
    public float nota;

    public Estudiante(String nombre, int matricula, float nota) {
        super(nombre);
        this.matricula = matricula;
        this.nota = nota;
    }

    public String toString() {
        return " Id: " + this.matricula + " Nota: " + this.nota;
    }
}

interface IEstudiante {

    public String toString();
}

class EstudianteTrabajador extends Empleado implements
        IEstudiante {

    Estudiante estudiante;

    public EstudianteTrabajador(String nombre, int matricula,
            float nota, float salario) {
        super(nombre, salario);
        this.estudiante = new Estudiante(nombre, matricula, nota);
    }

    public String toString() {
        return super.toString() + " " + this.estudiante.toString();
    }
}

public class Practica7 {
    
    public static void despliegaObjeto(Figura f) {
        System.out.println(f);
    }

    public static boolean igualArea(Figura o1, Figura o2) {
        return o1.getArea() == o2.getArea();
    }

    public static void despliegaFigura(Figura o) {
        System.out.println(o);
        System.out.println("El área es " + o.getArea());
        System.out.println("El perímetro es " + o.getPerimetro());
    }

    public static void main(String[] args) {
        Coche mi_coche = new Coche("Toyota", "Corolla", 2024, 4);
        System.out.println(mi_coche);
        Motocicleta mi_motocicleta = new Motocicleta("Honda", "CBR600RR", 2025, "4 cilindros");
        System.out.println(mi_motocicleta);

        System.out.println("----Ejercicio2----");
        Figura f1 = new Circulo(5,"double");
        Figura f2 = new Rectangulo(5.1, 3.5,"Rojo");
        despliegaObjeto(f1);
        despliegaObjeto(f2);
        Figura figuras[] = new Figura[2];
        figuras[0] = new Circulo(3, "Verde");
        figuras[1] = new Rectangulo(3, 4, "Naranja");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
        }/*
        System.out.println("----Ejercicio 3 Herencia----");
        EstudianteTrabajador et = new EstudianteTrabajador("Juan", 55555, 100, 2000);
        System.out.println(et);
        System.out.println("---Ejercicio 4 ----");
        Figura f3 = new Circulo(5,"double");
        Figura f4 = new Rectangulo(5.1, 3.5,"Rojo");
        System.out.println("Los dos objetos tienen la misma área?" + igualArea(f1, f2));
        despliegaFigura(f3);
        despliegaFigura(f4);*/
    }
}
