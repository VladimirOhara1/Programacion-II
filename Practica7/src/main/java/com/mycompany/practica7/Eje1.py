class Vehiculo:
    def __init__(self, marca, modelo, año):
        self.marca = marca
        self.modelo = modelo
        self.año = año
    def __str__(self):
        return "Marca: {}, Modelo: {}, Año: {}".\
               format(self.marca, self.modelo,self.año)
class Coche(Vehiculo):
    def __init__ (self, marca, modelo, año, numero_puertas):
        super().__init__(marca, modelo, año)
        self.numero_puertas = numero_puertas
    def __str__ (self):
        datos = super().__str__()
        return "Coche:\n{}\nNúmero de puertas: {}".\
           format(datos, self.numero_puertas)
class Motocicleta(Vehiculo):
    def __init__ (self, marca, modelo, año, tipo_motor):
        super().__init__(marca, modelo, año)
        self.tipo_motor = tipo_motor
    def __str__ (self):
        datos = super().__str__()
        return "Motocicleta:\n{}\nTipo de motor: {}".\
           format(datos,self.tipo_motor)
mi_coche = Coche("Toyota",
"Corolla", 2024, 4)
print(mi_coche)
mi_motocicleta = Motocicleta("Honda", "CBR600RR", 2025, "4 cilindros")
print(mi_motocicleta)
