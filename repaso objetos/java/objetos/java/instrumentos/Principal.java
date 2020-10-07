package objetos.java.instrumentos;
import java.util.Random;
public class Principal {
    public static void main(String[] args) {
        Instrumento i;
        Random rn= new Random();
        int sel = rn.nextInt(10);

        switch (sel) {
            case 1:
                i=new Guitarra();
                break;
            case 2:
                i=new Violin();
                break;
            default:
                i=new Bajo();
                break;
        }

        i.afinar();
        i.tocar();
        i.tocar("DO");
    }
    /* (ligadura dinamica donde se usa instrumento pero como guitarra o bajo)
    Inversion de dependencia donde no se definio
    la guitarra y el bajo en el principal, sino se definio
    como un instrumento permitiendo que el cliente pueda tomar
    la desicion de con cual intrumento quiere trabajar 
    por lo tanto nos brinda mucha flexibilidad (gracias al polimorfismo
    para extender nuestros modelos*/
}