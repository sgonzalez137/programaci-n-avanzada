package Conciertopaf.Fabrica_aire;
import Conciertopaf.Fabrica.Instrumento;
public class Trompeta implements Instrumento{
    @Override
    public void afinar() {
        System.out.println("Tocando trompeta");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando trompeta");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando Trompeta en "+ nota);
    }
}
