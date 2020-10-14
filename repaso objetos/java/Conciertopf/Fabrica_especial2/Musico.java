package Conciertop.Fabrica_especial2;
import Conciertop.Fabrica.Instrumento;
public class Musico extends Persona{
    public void tocar(Instrumento i){
        i.afinar();
        i.tocar();
    }
}
