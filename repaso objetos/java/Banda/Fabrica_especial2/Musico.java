package Banda.Fabrica_especial2;
import Banda.Fabrica.Instrumento;
public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
