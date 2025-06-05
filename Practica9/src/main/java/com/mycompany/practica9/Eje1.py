import math
class Figura:
    def __init__(self, color):
        self.color = color
    def getColor(self):
        return self.color
    def __str__(self):
        return "Figura [color={}]".format(self.color)
class Circulo (Figura):
    def __init__(self, radio, color):
        super().__init__(color)
        self.radio = radio
    def getArea(self):
        return math.pi * self.radio * self.radio
    def __str__(self):
        return "Circulo [radio= {}]".format(self.radio)
class Rectangulo (Figura):
    def __init__(self, ancho, alto, color):
        super().__init__(color)
        self.ancho = ancho
        self.alto = alto
    def getArea(self):
        return self.ancho * self.alto
from Eje1 import Figura, Circulo, Rectangulo
def despliegaObjeto(f):
    print(f)
    despliegaObjeto(Circulo(2, "Rojo"))
    despliegaObjeto(Rectangulo(2,3,"Azul"))
    figuras = [Circulo(2, "Rojo"),Rectangulo(2, 3, "Azul")]
    for f in figuras:
        print(f)
