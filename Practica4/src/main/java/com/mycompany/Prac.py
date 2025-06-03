import math

class Area:
    def calcular(self, *args):
        if len(args) == 1:
            r = args[0]
            return math.pi * r * r  # Círculo
        elif len(args) == 2:
            base, altura = args
            return base * altura  # Rectángulo
        elif len(args) == 3:
            a, b, h = args
            if a == 0 or b == 0:
                return 0.5 * a * h  # Triángulo rectángulo
            else:
                return ((a + b) * h) / 2  # Trapecio
        elif len(args) == 2 and args[1] == 'pentagono':
            lado = args[0]
            apotema = lado / (2 * math.tan(math.pi / 5))
            return (5 * lado * apotema) / 2
        else:
            raise ValueError("Parámetros inválidos")

a = Area()
print("Área círculo:", a.calcular(5))
print("Área rectángulo:", a.calcular(4, 6))
print("Área triángulo:", a.calcular(0, 4, 5))
print("Área trapecio:", a.calcular(6, 4, 3))
print("Área pentágono:", a.calcular(6, 'pentagono'))
