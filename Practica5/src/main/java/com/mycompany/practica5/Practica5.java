package com.mycompany.practica5;
/**
 *
 * @author Vladimir Ohara
 */
class Punto {
    public int x, y;
    public Punto(int x, int y) { // Constructor
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public boolean igual(Punto o) {
        return this.x == o.x && this.y == o.y;
    }

    public String toString() {
        return String.format("(%d, %d)/n", this.x, this.y);
    }

    protected void finalize() { // Destructor
        System.out.println("Eliminando Punto.");
    }
}
 class CuentaBancaria {
    private String numeroCuenta;
    private double saldoActual;
    private final double tasaInteres = 0.05;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        saldoActual += monto;
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto <= saldoActual) {
            saldoActual -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método privado para calcular el interés
    private void calcularInteres() {
        double intereses = saldoActual * tasaInteres;
        saldoActual += intereses;
    }

    // Método opcional para mostrar el saldo (para pruebas)
    public double getSaldo() {
        return saldoActual;
    }

    // Método para aplicar interés públicamente si se desea
    public void aplicarInteres() {
        calcularInteres();
    }
 }
public class Practica5 {
    public static void main(String[] args) {
        System.out.println("----Ejercicio1----");
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(3, 4);
        System.out.print(p1);
        System.out.print(p2);
        if (p1.igual(p2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        p1.finalize();
        p1 = null;
        p2.finalize();
        p2 = null;
        System.gc();
        System.out.println("método main().");
        
        System.out.println("----Ejercicio2----");
         CuentaBancaria cuenta = new CuentaBancaria("12345678", 1000.0);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.aplicarInteres();

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
