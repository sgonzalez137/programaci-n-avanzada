package Conciertopf.Fabrica_especial;
import Conciertopf.Fabrica.Instrumento;
public class Violin implements Instrumento{
    private String Cadenaa;
    private String Cadenat;
    private String Cadenatn;
    @Override
    public String afinar() {
        Cadenaa = "Tocando Violin";
        return Cadenaa;
    }

    @Override
    public String tocar() {
        Cadenat="Afinando Violin";
        return Cadenat;
    }

    @Override
    public String tocar(String nota) {
        Cadenatn="Tocando Violin en "+nota;
        return Cadenatn;

    }
}
