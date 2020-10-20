package Conciertopf.Fabrica_especial;
import Conciertopf.Fabrica.Instrumento;

public class Bajo implements Instrumento{
    private String Cadenaa;
    private String Cadenat;
    private String Cadenatn;
    @Override
    public String afinar() {
        Cadenaa = "Tocando Bajo";
        return Cadenaa;
    }

    @Override
    public String tocar() {
        Cadenat="Afinando Bajo";
        return Cadenat;
    }

    @Override
    public String tocar(String nota) {
        Cadenatn="Tocando Bajo en "+nota;
        return Cadenatn;

    }
    
    /* se hace re uso de la interfaz y tambien se hace sobre eescritura porque se esta 
    redifiniendo en cada instrumento, sobrecarga se hizo tambien cuando se puso tocar con 
    parametros y sin parametros, es decir usamos un poliformismo
    */
}
