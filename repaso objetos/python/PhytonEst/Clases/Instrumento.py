import random
from abc import ABCMeta, abstractmethod

class Instrumento(metaclass=ABCMeta):   
    @abstractmethod
    def afinar(self):
        pass

    @abstractmethod    
    def tocar(self):
        pass

    @abstractmethod    
    def tocarNota(self, nota):
        pass


class Bajo(Instrumento):
    def afinar(self):
        print('afinando bajo')
    def tocar(self):
        print('tocando bajo')
    def tocarNota(self, nota):
        print("tocando bajo en "+nota)

class Guitarra(Instrumento):
    def afinar(self):
        print('afinando guitarra')
    def tocar(self):
        print('tocando guitarra')
    def tocarNota(self, nota):
        print("tocando guitarra en "+nota)

class Violin(Instrumento):
    def afinar(self):
        print("afinando violin")
    def tocar(self):
        print("tocando violin")
    def tocarNota(self, nota):
        print("tocando violin en "+ nota)


rn = random.randint(0,3)
sel = rn
if sel == 1:
    i = Guitarra()
elif sel == 2:
    i = Bajo()
else:
    i = Violin()

i.afinar()
i.tocar()
i.tocarNota("Do")


        