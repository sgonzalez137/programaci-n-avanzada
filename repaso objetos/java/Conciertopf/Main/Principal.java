package Conciertopf.Main;

import Conciertopf.Grafica.GuiIntroc;
public class Principal {
    
    public static void main(String[] args) {
        
        GuiIntroc in = new GuiIntroc();
		in.setVisible(true);
    }
    /* (ligadura dinamica donde se usa instrumento pero como guitarra o bajo)
    Inversion de dependencia donde no se definio
    la guitarra y el bajo en el principal, sino se definio
    como un instrumento permitiendo que el cliente pueda tomar
    la desicion de con cual intrumento quiere trabajar 
    por lo tanto nos brinda mucha flexibilidad (gracias al polimorfismo
    para extender nuestros modelos*/
}