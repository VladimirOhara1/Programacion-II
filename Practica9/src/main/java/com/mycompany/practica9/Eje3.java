package com.mycompany.practica9;

/**
 *
 * @author Vladimir Ohara
 */
public class Eje3 {

    class Persona {

        public String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }

    class Empleado extends Persona {

        public float salario;

        public Empleado(String nombre, float salario) {
            super(nombre);
            this.salario = salario;
        }

        public String toString() {
            return this.nombre + " Salario: " + this.salario;
        }
    }

    class Estudiante extends Persona {

        public int matricula;
        public float nota;

        public Estudiante(String nombre, int matricula, float nota) {
            super(nombre);
            this.matricula = matricula;
            this.nota = nota;
        }

        public String toString() {
            return " Id: " + this.matricula + " Nota: " + this.nota;
        }
    }

    interface IEstudiante {

        public String toString();
    }

    class EstudianteTrabajador extends Empleado implements
            IEstudiante {

        Estudiante estudiante;

        public EstudianteTrabajador(String nombre, int matricula,float nota, float salario) 
        {
            super(nombre, salario);
            this.estudiante = new Estudiante(nombre, matricula, nota);
        }

        public String toString() {
            return super.toString() + " " + this.estudiante.toString();
        }
    }
}
