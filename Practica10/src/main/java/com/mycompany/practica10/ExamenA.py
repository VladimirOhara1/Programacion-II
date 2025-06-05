class Empleado:
    def __init__(self, nombre, apellido_paterno, apellido_materno, edad, sueldo):
        self.nombre = nombre
        self.apellido_paterno = apellido_paterno
        self.apellido_materno = apellido_materno
        self.edad = edad
        self.sueldo = sueldo


class LineaTeleferico:
    def __init__(self, color, tramo, nro_cabinas):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def eliminar_por_apellido(self, apellido):
        self.empleados = [
            e for e in self.empleados
            if e.apellido_paterno != apellido and e.apellido_materno != apellido
        ]

    def transferir_empleado(self, nombre, destino):
        for i, e in enumerate(self.empleados):
            if e.nombre == nombre:
                destino.agregar_empleado(e)
                del self.empleados[i]
                break

    def obtener_mayor_edad(self):
        if not self.empleados:
            return None
        return max(self.empleados, key=lambda e: e.edad)

    def obtener_mayor_sueldo(self):
        if not self.empleados:
            return None
        return max(self.empleados, key=lambda e: e.sueldo)

    def mostrar_empleado(self, empleado):
        if empleado:
            print(f"{empleado.nombre} {empleado.apellido_paterno} {empleado.apellido_materno}, "
                  f"Edad: {empleado.edad}, Sueldo: {empleado.sueldo}")

# a)
linea_roja = LineaTeleferico("Rojo", "Estación Central - Cementerio - 16 de Julio", 20)
linea_roja.agregar_empleado(Empleado("Pedro", "Rojas", "Luna", 35, 2500))
linea_roja.agregar_empleado(Empleado("Lucy", "Sosa", "Rios", 43, 3250))
linea_roja.agregar_empleado(Empleado("Ana", "Perez", "Rojas", 26, 2700))
linea_roja.agregar_empleado(Empleado("Saul", "Arce", "Calle", 29, 2500))

linea_azul = LineaTeleferico("Azul", "UPEA - Río Seco", 15)

# b)
linea_roja.eliminar_por_apellido("Rojas")

# c)
linea_roja.transferir_empleado("Pedro", linea_azul)

# d)
mayor_edad = linea_roja.obtener_mayor_edad()
linea_roja.mostrar_empleado(mayor_edad)

mayor_sueldo = linea_roja.obtener_mayor_sueldo()
linea_roja.mostrar_empleado(mayor_sueldo)
