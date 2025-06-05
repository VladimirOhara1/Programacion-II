class C1:
    def __init__(self):
        self.x = 1 # publico
        self._y = 2 # protegido
        self.__z = 3 # privado
class C2(C1):
    def __str__(self):
        a = self.x
        b = self._y
        return str(a) + " " + str(b)
o = C2()
print(o)
