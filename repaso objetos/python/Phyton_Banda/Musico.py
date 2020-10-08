from Persona import Persona
from Clases.Instrumento import *

class Musico(Persona):
    pass

    def tocar(self, inst):
        inst.afinar()
        inst.tocar()
        inst.tocarNota("Do")


