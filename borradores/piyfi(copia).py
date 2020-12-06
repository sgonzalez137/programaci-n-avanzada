import time

from random import randint

def generar_numero(cantidad):
    secreto = []
    while True:
        d = randint(0, 9)
        if d not in secreto:
            secreto.append(d)
        if len(secreto) == cantidad:
            break
    return secreto

def validar_numero(numero):
    if len(numero) == 1:
        return True
    else:
        if numero[0] in numero[1:]:
            return False
        else: 
            return validar_numero(numero[1:])

def capturar_numero():
    return [int(x) for x in input("ingrese un numero: ")]


usuario = input("Ingrese su nombre: ")

jugadas = 0

n = int(input("ingrese 1 si quiere dificutal facil( para 3 numeros), 2 si es normal (para 5 numeros)y 3 si es dificil (para 6 numeros)\n"))

intentos = 15 
cantidad=0

if n== 1:
    cantidad = 3
elif n== 2:
    cantidad = 5
elif n== 3:
    cantidad = 6
picas = 0
fijas = 0
extra = 0
g = generar_numero(cantidad)
p = []
i = cantidad
while g != p :
    if intentos > jugadas:
        p = [int(x) for x in input("ingrese un numero: ")]
        aux2 =cantidad
        while cantidad>0:
            print(cantidad)
            auxcant = i
            
            #print(g)
            print(p)
            if g[cantidad-1]==p[cantidad-1]:
                fijas = fijas + 1
                picas = picas - 1
                
            
            while auxcant>0 :
                
                if g[auxcant-1]==p[cantidad-1]:
                    picas = picas + 1
                auxcant = auxcant - 1
            cantidad=cantidad- 1
        

        jugadas=jugadas+ 1
        
        
        
        print( picas, "p ", fijas, " f" )
        print("fijas: ")
        print(fijas)
        fijas =0
        picas =0
        cantidad = aux2
        print("te quedan estos intentos")
        print(intentos-jugadas)
    else:
        resp=input("desea continuar si o no: ")
        if resp == "si":
            jugadas= 14
#####

###
            extra= extra +1
        elif resp == "no":
            print("gameover")
            jugadas=jugadas + extra
            break
            


#puntaje = [usuario, jugadas]
