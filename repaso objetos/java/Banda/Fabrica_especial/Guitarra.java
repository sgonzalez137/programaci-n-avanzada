package objetos.java.Fabrica_especial;
import objetos.java.Fabrica.Instrumento;
public class Guitarra implements Instrumento {

    @Override
    public void afinar() {
        System.out.println("Tocando guitarra");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando guitarra");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando guitarra en "+ nota);

    }
    /*Guitarra se ve obligada a implementar los metodos de Instrumento, este principio se llama "diseño por contrato" donde se le dice a los cliente- 
    voy a difinir un contrato entre usted y yo- como usted me implementa- va a usar los metodos que estan en la clase instrumento*/
 
}
