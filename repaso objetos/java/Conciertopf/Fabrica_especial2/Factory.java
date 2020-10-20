package Conciertopf.Fabrica_especial2;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import Conciertopf.Fabrica.Instrumento;
import Conciertopf.Fabrica_especial.Bajo;
import Conciertopf.Fabrica_especial.Guitarra;
import Conciertopf.Fabrica_especial.Violin;
import Conciertopf.Grafica.GuiPrersentar;

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
            String m,c1,c2;
            m = musico.getNombre();
            
            musico.tocar(generarInstrumento());
            
            c1=musico.getC();
            c2=musico.getP();
            GuiPrersentar pre= new GuiPrersentar(m,c1,c2);
            pre.setVisible(true);
            

            
        }
    }
}

