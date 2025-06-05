package com.mycompany.practica10;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ExamenA {
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
}
