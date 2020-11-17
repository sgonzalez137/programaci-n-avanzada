import os

class Archivo():
    lista=[True,2]
    a=2
    def crearArchivo(self, nombre):
        #os.remove("score.txt")
        if not os.path.exists(nombre):
            f=open(nombre,"x")
            f.close()

    def escribirJugador(self,jugador):
        f=open("score.txt","a")
        f.write("/".join(jugador)+ "\n")
        f.close()

    def leerEstadisticasJugador(self,nivel,nombre):
        f=open("score.txt","r")
        for linea in f.readlines():            
            elementos = [x for x in linea.split("/")]
            
            if elementos[0]==nivel and elementos[1]==nombre:
                break
        f.close()    
        elementos[6]=elementos[6].replace("\n","")
        return elementos 

    def mejorPuntaje(self,nivel):
        f=open("score.txt","r")
        for linea in f.readlines():            
            elementos = [x for x in linea.split("/")]
            if elementos[0]==nivel:
                elementosAux=elementos
                break
        f.close()
        f=open("score.txt","r")    
        for linea2 in f.readlines():                  
            elementos = [x for x in linea2.split("/")]
            if elementos[0]==nivel and int(elementos[5])<int(elementosAux[5]):
                elementosAux=elementos
        elementosAux[6]=elementosAux[6].replace("\n","")        
        return elementosAux    

            

    