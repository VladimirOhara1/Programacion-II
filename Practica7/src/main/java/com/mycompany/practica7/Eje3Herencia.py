class Persona:
    def __init__(self, nombre):
        self.nombre = nombre
class Empleado(Persona):
    def __init__(self, nombre, salario):
        Persona.__init__(self, nombre)
        self.salario = salario
    def __str__(self):
        return self.nombre + " Salario: " + str(self.salario)
class Estudiante(Persona):
    def __init__(self, matricula, nota):
        self.matricula = matricula
        self.nota = nota
    def __str__(self):
        return " Id: " + str(self.matricula) + " Nota: " +str(self.nota)
class EstudianteTrabajador(Empleado, Estudiante):
    def __init__(self, nombre, matricula, nota, salario):
        Empleado.__init__(self, nombre, salario)
        Estudiante.__init__(self, matricula, nota)
    def __str__(self):
        return Empleado.__str__(self) + " " + Estudiante.__str__(self)
et = EstudianteTrabajador("Juan",55555,100, 2000)
print(et)
