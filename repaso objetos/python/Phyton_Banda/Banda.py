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
 
    def generarRandom(self):
        a= random.randint(0,2) 
        return a  

    def presentarBanda(self):
        a=Banda()
        for i in self.musicos: 
            i.presentar()
            rn = random.randint(0,2)
            sel = a.generarRandom()

            if sel == 1:
                j= Guitarra()
            elif sel == 2:
                j= Bajo()         
            else:
                j= Violin() 
            
            
            
            i.tocar(j)
            
            
               






