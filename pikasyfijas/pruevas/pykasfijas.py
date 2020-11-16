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
def validarRegisro()
    try:
        f = open("archivo.txt", "r")
        f.close()
    except:
        f = open("archivo.txt", "w")
        f.close()

usuario = input("Ingrese su nombre: ")
timeini= time.time()

jugadas = 0

n = int(input("ingrese 1 si quiere dificutal facil( para 3 numeros), 2 si es normal (para 5 numeros)y 3 si es dificil (para 6 numeros)\n"))

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