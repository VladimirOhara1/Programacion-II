/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica6;
class Rectangulo {
    private int altura;
    private int base;
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    public Rectangulo() {
        this(0, 0);
    }
    public int getArea() {
        return altura * base;
    }
    public boolean esMayorQue(Rectangulo otro) {
        return this.getArea() > otro.getArea();
    }
    public boolean esIgualA(Rectangulo otro) {
        return this.altura == otro.altura && this.base == otro.base;
    }
    @Override
    public String toString() {
        return "Rectangulo [" + altura + "," + base + "]";
    }
}
public class Practica6 {

    public float suma(float a, float b) {
        return a + b;
    }

    public float suma(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("-----Ejercicio1----");
        float r1, r2;
        Practica6 ejemplo = new Practica6();
        r1 = ejemplo.suma(5.0f, 3.0f);
        r2 = ejemplo.suma(2.0f, 3.0f, 4.0f);
        System.out.println("Resultado 1: " + r1);
        System.out.println("Resultado 2: " + r2);
        System.out.println("----Ejercicio2----");
        Punto p1 = new Punto(2, 4);
        Punto p2 = new Punto(3, 5);
        System.out.println(p1);
        System.out.println(p2);
        Punto p3 = p1.sumar(p2);
        System.out.println(p3);
        System.out.println("----Ejercicio3----");
        Rectangulo l1 = new Rectangulo(2, 3);
        Rectangulo l2 = new Rectangulo(1, 2);
        if (l1.esMayorQue(l2)) {
            System.out.println("rectangulo1 > rectangulo2");
        } else {
            System.out.println("rectangulo1 <= rectangulo2");
        }
        if (l1.esIgualA(l2)) {
            System.out.println("iguales");
        } else {
            System.out.println("distintos");
        }
    }
}
