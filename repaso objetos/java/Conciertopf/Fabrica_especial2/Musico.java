package Conciertopf.Fabrica_especial2;
import Conciertopf.Fabrica.Instrumento;
public class Musico extends Persona{
    private String p,c;
    public void tocar(Instrumento i){
        
        p =i.afinar();
        c =i.tocar();
    }
    public String getC() {
        return c;
    }
    public String getP() {
        return p;
    }
}
