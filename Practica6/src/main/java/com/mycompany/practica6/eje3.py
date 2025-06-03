class Rectangulo:
def __init__(self, a=0, b=0):
self.__altura = a
self.__base = b
def getArea(self):
return self.__altura * self.__base
def __gt__(self, o):
return self.getArea() > o.getArea()
def __eq__(self, o):
return self.__altura == o.__altura and self.__base ==
o.__base
def __str__(self):
return "Rectangulo [{},{}]".format(self.__altura,
self.__base)
r1 = Rectangulo(2,3)
r2 = Rectangulo(1,2)
if r1 > r2:
print("rectangulo1 > rectangulo2")
else:
print("rectangulo1 <= rectangulo2")
if r1 == r2:
print("iguales")
else:
print("distintos")
