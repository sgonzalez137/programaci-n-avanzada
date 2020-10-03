package objetos.java.instrumentos;

public class Bajo implements Instrumento{

    @Override
    public void afinar() {
        System.out.println("Tocando bajo");

    }

    @Override
    public void tocar() {
        System.out.println("Afinando bajo");


    }

    @Override
    public void tocar(String nota) {
        System.out.println("Tocando bajo en "+ nota);

    }
    /* se hace re uso de la interfaz y tambien se hace sobre eescritura porque se esta 
    redifiniendo en cada instrumento, sobrecarga se hizo tambien cuando se puso tocar con 
    parametros y sin parametros, es decir usamos un poliformismo
    */
}
