package Concierto.Factory;
import Concierto.Fabrica.Instrumento;
import java.util.Random;
import Concierto.Fabrica_cuerda.Bajo;
import Concierto.Fabrica_cuerda.Guitarra;
import Concierto.Fabrica_cuerda.Violin;
public class CuerdaInstrumentFactory {
    public Instrumento seleccionar (){
        Random rn = new Random();
        int opc = rn.nextInt(6);
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
