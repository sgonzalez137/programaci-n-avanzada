package Banda.Fabrica_especial2;
import Banda.Fabrica.Instrumento;
import java.util.ArrayList;
import java.util.Random;
import Banda.Fabrica_especial.Guitarra;
import Banda.Fabrica_especial.Bajo;
import Banda.Fabrica_especial.Violin;

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

