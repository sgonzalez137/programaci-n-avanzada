package Conciertopaf.Fabrica_especial2;
import Conciertopaf.Fabrica.Instrumento;
public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
