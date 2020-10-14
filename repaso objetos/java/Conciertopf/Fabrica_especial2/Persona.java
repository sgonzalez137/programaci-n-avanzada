package Conciertop.Fabrica_especial2;
public class Persona {
    private String nombre;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void presentar(){
        System.out.println("Hola mi nombre es "+this.nombre);
    }
}
