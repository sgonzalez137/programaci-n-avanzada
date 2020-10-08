from Musico import Musico
from Clases.Instrumento import *
import random

class Banda():
    
    def __init__(self):
        self.musicos=list()

    def agregarMusico(self,nombre):
        m=Musico()
        m.set__nombre__(nombre)
        self.musicos.append(m)  

    def generarInstrumento(self):
        rn = random.randint(0,3)
        sel = rn
        i=Instrumento()
        if sel == 1:
            i= Guitarra()
            return i
        elif sel == 2:
            i= Bajo()
            return i
        else:
            i= Violin()
            return i
        return i   

    def presentarBanda(self):
        for i in self.musicos: 
            i.presentar()
            i.tocar(Violin())
            
            
               






