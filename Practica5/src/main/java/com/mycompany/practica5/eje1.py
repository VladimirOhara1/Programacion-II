class Punto:
def _init_(self, x=0, y=0):
self.x = x
self.y = y
def getX(self):
return self.x
def getY(self):
return self.y
def __eq__(self, o):
return self.x == o.x and self.y == o.y
def __str__(self):
return "({}, {})".format(self.x, self.y)
def __del__(self): 
print("Eliminando Punto.")
p1 = Punto(1,2)
p2 = Punto(3,4)
print(p1)
print(p2)
if p1 == p2:
print("Son iguales")
else:
print("Son distintos")
del p1
del p2
