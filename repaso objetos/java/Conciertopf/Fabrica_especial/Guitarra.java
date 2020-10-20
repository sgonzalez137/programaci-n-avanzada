package Conciertopf.Fabrica_especial;
import Conciertopf.Fabrica.Instrumento;
public class Guitarra implements Instrumento {

    private String Cadenaa;
    private String Cadenat;
    private String Cadenatn;
    @Override
    public String afinar() {
        Cadenaa = "Tocando Guitarra";
        return Cadenaa;
    }

    @Override
    public String tocar() {
        Cadenat="Afinando Guitarra";
        return Cadenat;
    }

    @Override
    public String tocar(String nota) {
        Cadenatn="Tocando Guitarra en "+nota;
        return Cadenatn;

    }
    
    
    /*Guitarra se ve obligada a implementar los metodos de Instrumento, este principio se llama "diseño por contrato" donde se le dice a los cliente- 
    voy a difinir un contrato entre usted y yo- como usted me implementa- va a usar los metodos que estan en la clase instrumento*/
 
}
