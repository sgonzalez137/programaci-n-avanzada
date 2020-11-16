jugador1 = [ jose, 4, 0.456]

jugador2 = [alejandro, 3, 1.23]

jugador3 = [nanaiga, 3, 0.98]

print (jugador[2])

#creando el archivo de puntajes

f = open("puntajes.txt","w") #creamos el archivo en modo escritura
f.write(jugador1 + "\n")
f.close()

f = open("puntajes.txt","r")
g = f.readlines()
elementos = [int(x) for x in linea.split(",")]
print( elementos[x],"\n")
ranking

def ranking(jugador2):
	if elemento[x-1] < jugador2[x-1]: #valida si el numero de intentos es menor que el el ultimo puntaje ingresado
		return anexarpuntaje(jugador2)
	if elemento[x-1] = jugador2[x-1]:
		if elemento[x] < jugador[x]:
			return anexarpuntaje(jugador2)
	else:
		break
	

def anexarpuntaje(jugador):
	f = open("puntajes.txt","a")
	f.write(jugador)
	f.close()
	return 0


