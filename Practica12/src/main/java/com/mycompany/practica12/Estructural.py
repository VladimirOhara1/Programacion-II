class EnchufeEuropeo:
    def conectar_europeo(self):
        print("Conectado a enchufe europeo.")

class EnchufeAmericano:
    def conectar(self):
        pass

class AdaptadorEuropeo(EnchufeAmericano):
    def __init__(self, enchufe_europeo):
        self.enchufe_europeo = enchufe_europeo

    def conectar(self):
        self.enchufe_europeo.conectar_europeo()

if __name__ == "__main__":
    europeo = EnchufeEuropeo()
    adaptador = AdaptadorEuropeo(europeo)
    adaptador.conectar()
