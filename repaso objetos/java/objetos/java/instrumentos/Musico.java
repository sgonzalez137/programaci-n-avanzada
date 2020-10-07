package objetos.java.instrumentos;

public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
