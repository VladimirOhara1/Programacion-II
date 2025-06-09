class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre

    def actualizar(self, estado):
        print(f"{self.nombre} recibió: {estado}")
class Canal:
    def __init__(self):
        self.suscriptores = []

    def suscribir(self, usuario):
        self.suscriptores.append(usuario)

    def subir_video(self, titulo):
        for suscriptor in self.suscriptores:
            suscriptor.actualizar(f"Nuevo video: {titulo}")
if __name__ == "__main__":
    canal = Canal()
    ana = Usuario("Ana")
    pedro = Usuario("Pedro")
    canal.suscribir(ana)
    canal.suscribir(pedro)
    canal.subir_video("Patrón Python")
