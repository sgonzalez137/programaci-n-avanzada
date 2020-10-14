package Conciertopaf.Factory;
import java.util.Random;

import Conciertopaf.Fabrica.Instrumento;
import Conciertopaf.Fabrica_aire.Flauta;
import Conciertopaf.Fabrica_aire.Saxofon;
import Conciertopaf.Fabrica_aire.Trompeta;
public class AireInstrumentFactory {
    public Instrumento seleccionar (){
        Random rn = new Random();
        int opc = rn.nextInt(3);
        switch(opc){
            case 0:
                return new Flauta();
            case 1:
                return new Saxofon();
            default:
                return new Trompeta();
        }
    }
}
