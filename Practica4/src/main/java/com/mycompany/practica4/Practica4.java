package com.mycompany.practica4;

import java.util.*;

/**
 *
 * @author Vladimir Ohara
 */
public class Practica4 {

    public double calcular(double radio) {
        return Math.PI * radio * radio;
    }

    // Rectángulo
    public double calcular(double base, double altura) {
        return base * altura;
    }

    // Triángulo rectángulo
    public double calcularTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Trapecio
    public double calcular(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    // Pentágono regular
    public double calcularPentagono(double lado) {
        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        return (5 * lado * apotema) / 2;
    }

    public static void main(String[] args) {
        Practica4 area = new Practica4();
        System.out.println("Área círculo: " + area.calcular(5));
        System.out.println("Área rectángulo: " + area.calcular(4, 6));
        System.out.println("Área triángulo: " + area.calcularTriangulo(4, 5));
        System.out.println("Área trapecio: " + area.calcular(6, 4, 3));
        System.out.println("Área pentágono: " + area.calcularPentagono(6));
    }
}
