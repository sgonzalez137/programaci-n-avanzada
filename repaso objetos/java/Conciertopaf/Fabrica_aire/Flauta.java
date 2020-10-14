package Concierto.Fabrica_aire;
import Concierto.Fabrica.Instrumento;
public class Flauta implements Instrumento{
    @Override
    public void afinar() {
        System.out.println("Tocando Flauta");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando Flauta");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando Flauta en "+ nota);

    }
}
