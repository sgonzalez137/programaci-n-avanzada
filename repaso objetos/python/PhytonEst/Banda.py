from Musico import Musico
from Clases.Instrumento import *
import random

class Banda():
    
    def __init__(self):
        self.musicos=[]

    def agregarMusico(self,nombre):
        m=Musico()
        m.set__nombre__(nombre)
        self.musicos.append(m)  

    def generarInstrumento(self):
        rn = random.randint(0,3)
        sel = rn
        if sel == 1:
            return Guitarra()
        elif sel == 2:
            return Bajo()
        else:
            return Violin()

    def presentarBanda(self):
        for i in self.musicos: 
            self.musicos[i].presentar()
            self.musicos[i].tocar(generarInstrumento())
               
b=Banda()
b.agregarMusico("Miguel")               
b.presentarBanda()





'''public class Banda {
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void agregarMusico(String nombre){
        Musico m = new Musico();
        m.setNombre(nombre);
        musicos.add(m);
    }

    private Instrumento generarInstrumento(){
        Random rn = new Random();
        int opc = rn.nextInt(3);
        switch(opc){
            case 0:
                return new Guitarra();
            case 1:
                return new Bajo();
            default:
                return new Violin();
        }
    }

    public void presentarBanda(){
        for (Musico musico : musicos) {
            musico.presentar();
            musico.tocar(generarInstrumento());
        }
    }

}'''