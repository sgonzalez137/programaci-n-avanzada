class Animal :
    def alimentar(self):
        pass

class Perro(Animal):
    def alimentar(self):
        print("Gracias por alimentarme, guau")

class Gato(Animal):
    def alimentar(self):
        print("Gracias por alimentarme, miau")

a=Gato()