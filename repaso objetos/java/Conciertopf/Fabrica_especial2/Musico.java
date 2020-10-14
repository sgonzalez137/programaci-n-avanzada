package Conciertopf.Fabrica_especial2;
import Conciertopf.Fabrica.Instrumento;
public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
