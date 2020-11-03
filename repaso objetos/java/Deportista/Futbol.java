package Deportista;

public class Futbol implements Balones{

     @Override
    public void usar (){
        System.out.println("Usando balon de Futbol");
    }

    @Override
    public void usar (String conel){
        System.out.println("Usando balon de Futbol con "+conel);
    }

    @Override
    public void inflar() {
       System.out.println("Inflando balon de furbol");

    }

    
}