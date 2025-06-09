class Anuncio: 
    def __init__(self, numero, precio): 
        self.numero = numero 
        self.precio = precio 
 
class Artista: 
    def __init__(self, nombre, ci, años_experiencia): 
        self.nombre = nombre 
        self.ci = ci 
        self.años_experiencia = años_experiencia 
 
class Obra: 
    def __init__(self, titulo, material, a1: Artista, a2: Artista, anuncio: Anuncio = None): 
        self.titulo = titulo 
        self.material = material 
        self.a1 = a1 
        self.a2 = a2 
        self.anuncio = anuncio 
 
    def get_artista_mas_experto(self): 
        return self.a1 if self.a1.años_experiencia > self.a2.años_experiencia else self.a2 
 
    def set_anuncio(self, anuncio: Anuncio): 
        self.anuncio = anuncio 
 
    def get_precio(self): 
        return self.anuncio.precio if self.anuncio else 0 
 
class Pintura(Obra): 
    def __init__(self, titulo, material, a1: Artista, a2: Artista, genero, anuncio: Anuncio = None): 
        super().__init__(titulo, material, a1, a2, anuncio) 
        self.genero = genero 

# Creación de instancias
artista1 = Artista("Ana", "123", 10) 
artista2 = Artista("Luis", "456", 5) 
artista3 = Artista("Clara", "789", 8) 
artista4 = Artista("Carlos", "321", 12) 
 
anuncio1 = Anuncio(1, 1500) 
pintura_con_anuncio = Pintura("Sol", "óleo", artista1, artista2, "Paisaje", anuncio1) 
pintura_sin_anuncio = Pintura("Luna", "acrílico", artista3, artista4, "Abstracto") 

# Determinar el artista más experimentado 
experto1 = pintura_con_anuncio.get_artista_mas_experto() 
experto2 = pintura_sin_anuncio.get_artista_mas_experto() 

mas_experto = experto1 if experto1.años_experiencia > experto2.años_experiencia else experto2 
print("Artista con más experiencia:", mas_experto.nombre) 

# Asignar nuevo anuncio a la pintura sin anuncio
anuncio2 = Anuncio(2, 1800) 
pintura_sin_anuncio.set_anuncio(anuncio2) 

# Calcular el monto total de venta
monto_total = pintura_con_anuncio.get_precio() + pintura_sin_anuncio.get_precio() 
print("Monto total de venta:", monto_total)

