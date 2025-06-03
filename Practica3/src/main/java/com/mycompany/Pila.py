class Pila:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.top = -1
        self.n = n

    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            raise OverflowError("Pila llena")

    def pop(self):
        if not self.isEmpty():
            valor = self.arreglo[self.top]
            self.top -= 1
            return valor
        else:
            raise IndexError("Pila vacía")

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            raise IndexError("Pila vacía")

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1
