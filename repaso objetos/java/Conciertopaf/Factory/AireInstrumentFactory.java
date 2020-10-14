package Concierto.Factory;
import Concierto.Fabrica.Instrumento;
import java.util.Random;
import Concierto.Fabrica_aire.Flauta;
import Concierto.Fabrica_aire.Saxofon;
import Concierto.Fabrica_aire.Trompeta;
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
