package Conciertopaf.Factory;
import java.util.Random;

import Conciertopaf.Fabrica.Instrumento;
import Conciertopaf.Fabrica_cuerda.Bajo;
import Conciertopaf.Fabrica_cuerda.Guitarra;
import Conciertopaf.Fabrica_cuerda.Violin;
public class CuerdaInstrumentFactory {
    public Instrumento seleccionar (){
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
}
