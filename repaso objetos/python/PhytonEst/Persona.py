class Persona:

    def __init__(self):
        self.__nombre__ = ""
        
    def set__nombre__(self, nombre=""):
        self.__nombre__ = nombre

    def presentar(self):
        print("Hola mi nombre es "+ self.__nombre__)    

r=Persona()
r.set__nombre__("Miguel")

r.presentar()
