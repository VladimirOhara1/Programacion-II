from multimethod import multimethod
class Operaciones:
@multimethod
def suma(self, a: float, b: float):
return a + b
@multimethod
def suma(self, a: float, b: float, c: float):
return a + b + c
ejemplo = Operaciones()
r1 = ejemplo.suma(5.0, 3.0) 
r2 = ejemplo.suma(2.0, 3.0, 4.0) 
print("Resultado 1:", r1)
print("Resultado 2:", r2)
