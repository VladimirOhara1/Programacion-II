/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3;

/**
 *
 * @author Usuario
 */
public class Cola {

    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int count;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = 0;
        this.count = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            arreglo[fin] = e;
            fin = (fin + 1) % n;
            count++;
        } else {
            throw new RuntimeException("Cola llena");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long valor = arreglo[inicio];
            inicio = (inicio + 1) % n;
            count--;
            return valor;
        } else {
            throw new RuntimeException("Cola vacía");
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            throw new RuntimeException("Cola vacía");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == n;
    }

    public int size() {
        return count;
    }
}
