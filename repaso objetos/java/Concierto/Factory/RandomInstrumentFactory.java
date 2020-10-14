package Concierto.Factory;

import Concierto.Fabrica.Instrumento;
import java.util.Random;
import Concierto.Fabrica_cuerda.Bajo;
import Concierto.Fabrica_cuerda.Guitarra;
import Concierto.Fabrica_cuerda.Violin;
import Concierto.Fabrica_aire.Flauta;
import Concierto.Fabrica_aire.Saxofon;
import Concierto.Fabrica_aire.Trompeta;
public class RandomInstrumentFactory {
    public Instrumento seleccionar (){
        Random rn = new Random();
        int opc = rn.nextInt(6);
        switch(opc){
            case 0:
                return new Guitarra();
            case 1:
                return new Bajo();
            case 2:
                return new Violin();
            case 3:
                return new Flauta();
            case 4:
                return new Saxofon();
            default:
                return new Trompeta();
        }
    }
}
