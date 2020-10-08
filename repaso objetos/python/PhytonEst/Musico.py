from Persona import Persona
from Clases.Instrumento import *

class Musico(Persona):
    pass

    def tocar(self, inst):
        inst.afinar()
        inst.tocar()
        inst.tocarNota("Do")

r=Musico()

r.set__nombre__("miguel")
r.presentar()

i = Bajo()
r.tocar(i)
