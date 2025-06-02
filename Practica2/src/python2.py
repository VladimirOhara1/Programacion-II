
class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea desde {self.p1} hasta {self.p2}"

    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")


class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")
p1 = Punto(0, 0)
p2 = Punto(4, 3)
centro = Punto(2, 2)

linea = Linea(p1, p2)
circulo = Circulo(centro, 5)


print(linea)
linea.dibujaLinea()

print(circulo)
circulo.dibujaCirculo()
