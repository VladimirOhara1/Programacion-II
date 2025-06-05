package com.mycompany.practica9;
/**
 *
 * @author Vladimir Ohara
 */
class C1 {
public int x = 1;
protected int y = 2;
private int z = 3;
}
class C2 extends C1 {
public String toString(){
int a = x;
int b = y;
// int c = z; no se puede acceder
return a + " " + b;
}
}
public class Eje2 {
    
}
