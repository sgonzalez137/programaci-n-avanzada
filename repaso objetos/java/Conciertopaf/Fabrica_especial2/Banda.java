package Conciertopaf.Fabrica_especial2;
import java.util.ArrayList;
import Conciertopaf.Fabrica.Instrumento;
import Conciertopaf.Factory.AireInstrumentFactory;
import Conciertopaf.Factory.CuerdaInstrumentFactory;
import Conciertopaf.Factory.RandomInstrumentFactory;

public class Banda {
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void agregarMusico(String nombre){
        Musico m=new Musico();
        m.setNombre(nombre);
        musicos.add(m);
    }

    private Instrumento generarInstrumento(int tip){
        switch(tip){
            case 0:
                return new RandomInstrumentFactory().seleccionar();
            case 1:
                return new AireInstrumentFactory().seleccionar();
            default:
                return new CuerdaInstrumentFactory().seleccionar();
        }
    }

    public void presentarBanda(int tip){
        for (Musico musico : musicos){
            musico.presentar();
            
            musico.tocar(generarInstrumento(tip));
        }
    }
}

