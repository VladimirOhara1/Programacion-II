class CuentaBancaria:
def __init__(self, numero_cuenta, saldo_inicial):
    self.numero_cuenta = numero_cuenta
    self.__saldo_actual = saldo_inicial
    self.__tasa_interes = 0.05
def depositar(self, monto):
    self.__saldo_actual += monto
def retirar(self, monto):
    if monto <= self.__saldo_actual:
        self.__saldo_actual -= monto
        else :
            print("Saldo insuficiente")
def __calcular_interes(self):
    intereses = self.__saldo_actual *
    self.__tasa_interés
    self.__saldo_actual += intereses
