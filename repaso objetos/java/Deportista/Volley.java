package Deportista;

public class Volley implements Balones{

    @Override
    public void usar (){
        System.out.println("Usando balon de Volley");
    }

    @Override
    public void usar (String conel){
        System.out.println("Usando balon de Volley con "+conel);
    }

    @Override
    public void inflar() {
        System.out.println("Inflando balon de Volley");

    }

    
}   