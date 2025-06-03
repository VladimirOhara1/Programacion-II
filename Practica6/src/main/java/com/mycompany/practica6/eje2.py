class Punto:
def __init__(self, x=0, y=0):
self.x = x
self.y = y
def __add__(self, otro):
a = self.x + otro.x
b = self.y + otro.y
return Punto(a,b)
def __sub__(self, otro):
a = self.x - otro.x
b = self.y - otro.y
return Punto(a, b)
def __str__(self):
return "(x = {}, y = {})".format(self.x, self.y)
p1 = Punto(2, 4)
p2 = Punto(3, 5)
print(p1)
print(p2)
p3 = p1 + p2
print(p3)
