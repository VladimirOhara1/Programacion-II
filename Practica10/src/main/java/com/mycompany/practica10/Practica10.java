package com.mycompany.practica10;

/**
 *
 * @author Vladimir Ohara
 */
import java.util.*;

class Ministerio {

    private String nombre;
    private String direccion;
    private int nroEmpleados;
    private String[][] empleados; // [3][100] 
    private int[] edades; // [100] 
    private double[] sueldos; // [100] 

    public Ministerio(String nombre, String direccion, int nroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = nroEmpleados;
        empleados = new String[3][100];
        edades = new int[100];
        sueldos = new double[100];
    }

    public Ministerio() {
        this("SinNombre", "SinDireccion", 0);
    }

    public void agregarEmpleado(int pos, String nombre, int edad, double sueldo) {
        if (pos < 100) {
            empleados[0][pos] = nombre;
            edades[pos] = edad;
            sueldos[pos] = sueldo;
            nroEmpleados++;
        }
    }

    public void eliminarEmpleado(String nombre) {
        for (int i = 0; i < 100; i++) {
            if (empleados[0][i] != null && empleados[0][i].equals(nombre)) {
                empleados[0][i] = null;
                edades[i] = 0;
                sueldos[i] = 0;
                nroEmpleados--;
            }
        }
    }

    public void mostrarMenorSueldo() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            if (empleados[0][i] != null && sueldos[i] < min) {
                min = sueldos[i];
            }
        }
        System.out.println("Empleados con sueldo menor a " + min + ":");
        for (int i = 0; i < 100; i++) {
            if (empleados[0][i] != null && sueldos[i] == min) {
                System.out.println(empleados[0][i] + " - Sueldo: " + sueldos[i]);
            }
        }
    }

    public void mostrarMenor(String tipo) {
        if (tipo.equalsIgnoreCase("sueldo")) {
            mostrarMenorSueldo();
        } else if (tipo.equalsIgnoreCase("edad")) {
            int minEdad = Integer.MAX_VALUE;
            for (int i = 0; i < 100; i++) {
                if (empleados[0][i] != null && edades[i] < minEdad) {
                    minEdad = edades[i];
                }
            }
            System.out.println("Empleados con menor edad (" + minEdad + "):");
            for (int i = 0; i < 100; i++) {
                if (empleados[0][i] != null && edades[i] == minEdad) {
                    System.out.println(empleados[0][i] + " - Edad: " + edades[i]);
                }
            }
        }
    }

    public void transferirEmpleado(String nombre, Ministerio otro) {
        for (int i = 0; i < 100; i++) {
            if (otro.empleados[0][i] != null && otro.empleados[0][i].equals(nombre)) {
                // Buscar primer espacio vacío 
                for (int j = 0; j < 100; j++) {
                    if (this.empleados[0][j] == null) {
                        this.agregarEmpleado(j, nombre, otro.edades[i], otro.sueldos[i]);
                        otro.eliminarEmpleado(nombre);
                        System.out.println("Empleado " + nombre + " transferido.");
                        return;
                    }
                }
            }
        }
        System.out.println("Empleado " + nombre + " no encontrado para transferencia.");
    }

    public void mostrarEmpleados() {
        System.out.println("Ministerio: " + nombre);
        for (int i = 0; i < 100; i++) {
            if (empleados[0][i] != null) {
                System.out.println("Nombre: " + empleados[0][i] + " | Edad: " + edades[i] + " |Sueldo:" + sueldos[i]);
            }
        }
    }
}
//Examen B

class Empleado {

    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
    double sueldo;

    Empleado(String nombre, String apP, String apM, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellidoPaterno = apP;
        this.apellidoMaterno = apM;
        this.edad = edad;
        this.sueldo = sueldo;
    }
}

class LineaTeleferico {

    String color;
    String tramo;
    int nroCabinas;
    ArrayList<Empleado> empleados;

    LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.empleados = new ArrayList<>();
    }

    void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    void eliminarPorApellido(String apellido) {
        empleados.removeIf(e -> e.apellidoPaterno.equals(apellido) || e.apellidoMaterno.equals(apellido));
    }

    void transferirEmpleado(String nombre, LineaTeleferico destino) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).nombre.equals(nombre)) {
                destino.agregarEmpleado(empleados.get(i));
                empleados.remove(i);
                break;
            }
        }
    }

    Empleado obtenerMayorEdad() {
        return empleados.stream().max(Comparator.comparingInt(e -> e.edad)).orElse(null);
    }

    Empleado obtenerMayorSueldo() {
        return empleados.stream().max(Comparator.comparingDouble(e -> e.sueldo)).orElse(null);
    }

    void mostrarEmpleado(Empleado e) {
        if (e != null) {
            System.out.println(e.nombre + " " + e.apellidoPaterno + " " + e.apellidoMaterno + ", Edad: " + e.edad + ", Sueldo: " + e.sueldo);
        }
    }
}

public class Practica10 {

    public static void main(String[] args) {
        System.out.println("----Inciso A----");
        Ministerio min1 = new Ministerio("Educación", "La Paz", 0);
        Ministerio min2 = new Ministerio();
        min2.agregarEmpleado(0, "Pedro", 35, 2500);
        min2.agregarEmpleado(1, "Ana", 43, 3250);
        min2.agregarEmpleado(2, "Luis", 26, 2700);
        min2.agregarEmpleado(3, "María", 29, 2500);
        System.out.println("=== Ministerio 2 Inicial ===");
        min2.mostrarEmpleados();
        System.out.println("----Inciso B----");
        min2.eliminarEmpleado("Ana");
        System.out.println("\n=== Ministerio 2 Después de eliminar a Ana ===");
        min2.mostrarEmpleados();
        System.out.println("----Inciso C----");
        min1.transferirEmpleado("Pedro", min2);
        System.out.println("\n=== Después de Transferencia ===");
        System.out.println("Ministerio 1:");
        min1.mostrarEmpleados();
        System.out.println("Ministerio 2:");
        min2.mostrarEmpleados();
        System.out.println("----Inciso D----");
        System.out.println("\n--- Mostrar empleados con menor edad ---");
        min1.mostrarMenor("edad");
        System.out.println("\n--- Mostrar empleados con menor sueldo ---");
        min1.mostrarMenor("sueldo");

        LineaTeleferico lineaRoja = new LineaTeleferico("Rojo", "Estación Central - Cementerio - 16 de Julio", 20);
        lineaRoja.agregarEmpleado(new Empleado("Pedro", "Rojas", "Luna", 35, 2500));
        lineaRoja.agregarEmpleado(new Empleado("Lucy", "Sosa", "Rios", 43, 3250));
        lineaRoja.agregarEmpleado(new Empleado("Ana", "Perez", "Rojas", 26, 2700));
        lineaRoja.agregarEmpleado(new Empleado("Saul", "Arce", "Calle", 29, 2500));
        LineaTeleferico lineaAzul = new LineaTeleferico("Azul", "UPEA - Río Seco", 15);
        System.out.println("Inciso B");
        lineaRoja.eliminarPorApellido("Rojas");
        System.out.println("Inciso C");
        lineaRoja.transferirEmpleado("Pedro", lineaAzul);
        System.out.println("Inciso D");
        Empleado mayorEdad = lineaRoja.obtenerMayorEdad();
        lineaRoja.mostrarEmpleado(mayorEdad);
        Empleado mayorSueldo = lineaRoja.obtenerMayorSueldo();
        lineaRoja.mostrarEmpleado(mayorSueldo);
    }
}
