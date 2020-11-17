jugadores=[]
jugador=[1,"miguel",5,324,0,3,True] 
jugador1=[1,"angel",7,432,0,3,True] 
jugador2=[2,"jose",1,521,0,3,True] 
jugador3=[1,"alejandro",4,182,0,3,False] 

jugadores.append(jugador)
jugadores.append(jugador1)
jugadores.append(jugador2)
jugadores.append(jugador3)



f=open("archivo.txt","w")
for i in range(0,4):    
    f.write(str(jugadores[i][0]) + ", " + jugadores[i][1]+ ", " + str(jugadores[i][2]) +", "+ str(jugadores[i][3]) +", "+ str(jugadores[i][4]) +", "+ str(jugadores[i][5]) +", "+ str(jugadores[i][6])+"\n")

f.close()    

f = open("archivo.txt","r")
a=input("eliga el nivel que quiera ver el mejor: ")
l=f.readline()   

elementoCompar=[x for x in l.split(",")]    
for linea in f.readlines():
    elementos = [x for x in linea.split(",")]

    if a==elementoCompar[0] and a==elementos[0]:
        if elementoCompar[2] > elementos[2]:
            elementoCompar=elementos

f.close()    
print(elementoCompar)

#elementoCompar[6] and elementos[6] and