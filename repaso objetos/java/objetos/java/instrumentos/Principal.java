package objetos.java.instrumentos;

public class Principal {
    public static Banda b= new Banda();
    public static void main(String[] args) {
        b.agregarMusico("Juan");
        b.agregarMusico("Maria");
        b.agregarMusico("Miguel");
        b.presentarBanda();

    }
    /* (ligadura dinamica donde se usa instrumento pero como guitarra o bajo)
    Inversion de dependencia donde no se definio
    la guitarra y el bajo en el principal, sino se definio
    como un instrumento permitiendo que el cliente pueda tomar
    la desicion de con cual intrumento quiere trabajar 
    por lo tanto nos brinda mucha flexibilidad (gracias al polimorfismo
    para extender nuestros modelos*/
}