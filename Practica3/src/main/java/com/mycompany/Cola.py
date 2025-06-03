class Cola:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = 0
        self.n = n
        self.count = 0

    def insert(self, e):
        if not self.isFull():
            self.arreglo[self.fin] = e
            self.fin = (self.fin + 1) % self.n
            self.count += 1
        else:
            raise OverflowError("Cola llena")

    def remove(self):
        if not self.isEmpty():
            valor = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.count -= 1
            return valor
        else:
            raise IndexError("Cola vacía")

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            raise IndexError("Cola vacía")

    def isEmpty(self):
        return self.count == 0

    def isFull(self):
        return self.count == self.n

    def size(self):
        return self.count
