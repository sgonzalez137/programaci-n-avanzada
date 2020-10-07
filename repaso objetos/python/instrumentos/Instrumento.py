import random
class Instrumento:
    def __init__(self):
        pass
    def afinar(self):
        pass

    def tocar(self):
        pass

    def tocar(cadena, nota):
        pass


class Bajo(Instrumento):
    def __init__(self):
        pass
    def afinar(self):
        print('afinando bajo')
    def tocar(self):
        print('tocando bajo')
    def tocar_1(cadena, nota):
        print('tocando bajo en '+nota)

class Guitarra(Instrumento):
    def __init__(self):
        pass
    def afinar(self):
        print('afinando guitarra')
    def tocar(self):
        print('tocando guitarra')
    def tocar_1(cadena, nota):
        print('tocando guitarra en '+nota)

class Violin(Instrumento):
    def __init__(self):
        pass
    def afinar(self):
        print('afinando violin')
    def tocar(self):
        print('tocando violin')
    def tocar_1(cadena, nota):
        print('tocando violin en '+nota)

i = Instrumento()
rn = random.randint(0,3)
sel = rn
if sel == 1:
    i = Guitarra()
if sel == 2:
    i = Bajo()
else:
    i = Violin()

i.tocar('DO')


