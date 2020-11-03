package Deportista;

public class Principal {

    public static Preparar prep = new Preparar();

    public static void main(String[] args){

        prep.agregar("El_Pepe",22);
        prep.agregar("Ete_sech",88);
        prep.agregar("Sebastian",69);
        prep.jugando();

    }
}