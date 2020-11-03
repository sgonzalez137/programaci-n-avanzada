package Deportista ;

public class Basqet implements Balones{

     @Override
    public void usar (){
        System.out.println("Usando balon de Basqet");
    }

    @Override
    public void usar (String conel){
        System.out.println("Usando balon de Basqet con "+conel);
    }

    @Override
    public void inflar() {
        System.out.println("Inflando balos de Basquet");

    }

    
}