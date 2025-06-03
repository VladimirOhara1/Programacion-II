package com.mycompany.practica6;

/**
 *
 * @author Vladimir Ohara
 */
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Punto() {
        this(0, 0);
    }
    public Punto sumar(Punto otro) {
        int a = this.x + otro.x;
        int b = this.y + otro.y;
        return new Punto(a, b);
    }
    public Punto restar(Punto otro) {
        int a = this.x - otro.x;
        int b = this.y - otro.y;
        return new Punto(a, b);
    }
    @Override
    public String toString() {
        return "(x = " + x + ", y = " + y + ")";
    }
}
