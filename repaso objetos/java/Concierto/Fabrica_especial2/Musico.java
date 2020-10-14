package Concierto.Fabrica_especial2;
import Concierto.Fabrica.Instrumento;
public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
