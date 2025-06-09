class Singleton:
    _instance = None

    @staticmethod
    def get_instance():
        if Singleton._instance is None:
            Singleton._instance = Singleton()
        return Singleton._instance

    def show_message(self):
        print("Instancia única activa.")

s1 = Singleton.get_instance()
s2 = Singleton.get_instance()
print(s1 == s2) 
