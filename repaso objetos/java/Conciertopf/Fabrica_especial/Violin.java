package Conciertop.Fabrica_especial;
import Conciertop.Fabrica.Instrumento;
public class Violin implements Instrumento{
    @Override
    public void afinar() {
        System.out.println("Tocando violin");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando violin");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando violin en "+ nota);

    }
}
