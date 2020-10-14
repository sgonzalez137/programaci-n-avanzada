package Conciertopaf.Fabrica_aire;
import Conciertopaf.Fabrica.Instrumento;
public class Saxofon implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Tocando Saxofon");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando Saxofon");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando Saxofon en "+ nota);

    }
}
