class Ministerio:
    def __init__(self, nombre="SinNombre", direccion="SinDireccion", nro_empleados=0):
        self.nombre = nombre
        self.direccion = direccion
        self.nro_empleados = nro_empleados
        self.empleados = [None] * 100  
        self.edades = [0] * 100
        self.sueldos = [0.0] * 100

    def agregar_empleado(self, pos, nombre, edad, sueldo):
        if 0 <= pos < 100:
            self.empleados[pos] = nombre
            self.edades[pos] = edad
            self.sueldos[pos] = sueldo
            self.nro_empleados += 1

    def eliminar_empleado(self, nombre):
        for i in range(100):
            if self.empleados[i] is not None and self.empleados[i] == nombre:
                self.empleados[i] = None
                self.edades[i] = 0
                self.sueldos[i] = 0.0
                self.nro_empleados -= 1

    def mostrar_menor_sueldo(self):
        min_sueldo = float('inf')
        for i in range(100):
            if self.empleados[i] is not None and self.sueldos[i] < min_sueldo:
                min_sueldo = self.sueldos[i]

        print(f"Empleados con sueldo menor a {min_sueldo}:")
        for i in range(100):
            if self.empleados[i] is not None and self.sueldos[i] == min_sueldo:
                print(f"{self.empleados[i]} - Sueldo: {self.sueldos[i]}")

    def mostrar_menor(self, tipo):
        if tipo.lower() == "sueldo":
            self.mostrar_menor_sueldo()
        elif tipo.lower() == "edad":
            min_edad = float('inf')
            for i in range(100):
                if self.empleados[i] is not None and self.edades[i] < min_edad:
                    min_edad = self.edades[i]

            print(f"Empleados con menor edad ({min_edad}):")
            for i in range(100):
                if self.empleados[i] is not None and self.edades[i] == min_edad:
                    print(f"{self.empleados[i]} - Edad: {self.edades[i]}")

    def transferir_empleado(self, nombre, otro):
        for i in range(100):
            if otro.empleados[i] is not None and otro.empleados[i] == nombre:
                for j in range(100):
                    if self.empleados[j] is None:
                        self.agregar_empleado(j, nombre, otro.edades[i], otro.sueldos[i])
                        otro.eliminar_empleado(nombre)
                        print(f"Empleado {nombre} transferido.")
                        return
        print(f"Empleado {nombre} no encontrado para transferencia.")

    def mostrar_empleados(self):
        print(f"Ministerio: {self.nombre}")
        for i in range(100):
            if self.empleados[i] is not None:
                print(f"Nombre: {self.empleados[i]} | Edad: {self.edades[i]} | Sueldo: {self.sueldos[i]}")

if __name__ == "__main__":
    # a)
    min1 = Ministerio("Educación", "La Paz", 0)
    min2 = Ministerio()
    min2.agregar_empleado(0, "Pedro", 35, 2500)
    min2.agregar_empleado(1, "Ana", 43, 3250)
    min2.agregar_empleado(2, "Luis", 26, 2700)
    min2.agregar_empleado(3, "María", 29, 2500)

    print("=== Ministerio 2 Inicial ===")
    min2.mostrar_empleados()

    # b)
    min2.eliminar_empleado("Ana")

    print("\n=== Ministerio 2 Después de eliminar a Ana ===")
    min2.mostrar_empleados()

    # c)
    min1.transferir_empleado("Pedro", min2)

    print("\n=== Después de Transferencia ===")
    print("Ministerio 1:")
    min1.mostrar_empleados()
    print("Ministerio 2:")
    min2.mostrar_empleados()

    # d)
    print("\n--- Mostrar empleados con menor edad ---")
    min1.mostrar_menor("edad")
    print("\n--- Mostrar empleados con menor sueldo ---")
    min1.mostrar_menor("sueldo")
