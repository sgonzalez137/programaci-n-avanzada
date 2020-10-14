package Conciertopaf.Factory;

import java.util.Random;

import Conciertopaf.Fabrica.Instrumento;
import Conciertopaf.Fabrica_aire.Flauta;
import Conciertopaf.Fabrica_aire.Saxofon;
import Conciertopaf.Fabrica_aire.Trompeta;
import Conciertopaf.Fabrica_cuerda.Bajo;
import Conciertopaf.Fabrica_cuerda.Guitarra;
import Conciertopaf.Fabrica_cuerda.Violin;
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
