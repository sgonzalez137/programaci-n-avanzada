package Conciertopf.Fabrica_especial2;
import java.util.ArrayList;
import java.util.Random;

import Conciertopf.Fabrica.Instrumento;
import Conciertopf.Fabrica_especial.Bajo;
import Conciertopf.Fabrica_especial.Guitarra;
import Conciertopf.Fabrica_especial.Violin;

public class Factory {
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void agregarMusico(String nombre){
        Musico m=new Musico();
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
        for (Musico musico : musicos){
            musico.presentar();
            musico.tocar(generarInstrumento());
            
        }
    }
}

