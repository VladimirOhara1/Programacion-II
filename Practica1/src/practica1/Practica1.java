/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author Usuario
 */

  public class Practica1 {
public float x;
public float y;
public Practica1(float x, float y){
this.x = x;
this.y = y;
}
public float[] coord_cartesianas() {
 return new float[] {this.x, this.y};
}
public float[] coord_polares() {
 float radio = (float)Math.sqrt(this.x * this.x + this.y * this.y);
 float angulo = (float) Math.atan(this.y/this.y);
 angulo = (float) Math.toDegrees(angulo);
 return new float[] {radio, angulo};
}
public String toString(){
return String.format("(%.2f, %.2f)", this.x, this.y);
}
        
public static void main(String[] args) {
Practica1 p1 = new Practica1(0,3);
System.out.println(p1);
float a[] = p1.coord_cartesianas();
System.out.println(a[0] + " " + a[1]);
float b[] = p1.coord_polares();
System.out.println(b[0] + " " + b[1]);
}

  }