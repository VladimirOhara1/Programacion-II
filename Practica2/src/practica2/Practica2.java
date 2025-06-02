package practica2;

class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Linea {

    private Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea desde " + p1 + " hasta " + p2;
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea desde " + p1 + " hasta " + p2);
    }
}

class Circulo {

    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro en " + centro + " y radio " + radio);
    }
}

public class Practica2 {

    public static void main(String[] args) {
       Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 3);
        Punto centro = new Punto(2, 2);

        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(centro, 5.0f);

        System.out.println(linea);
        linea.dibujaLinea();

        System.out.println(circulo);
        circulo.dibujaCirculo();
    }

}
