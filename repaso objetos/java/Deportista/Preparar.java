package Deportista;

import java.util.ArrayList;
import java.util.Random;

public class Preparar {

    ArrayList<Jugador> team = new ArrayList<Jugador>();

    public void agregar (String nombre, int edad){
    
        Jugador j = new Jugador();
        j.setNombre(nombre);
        j.setEdad(edad);
        team.add(j);

    }

    public void jugando (){

        for(Jugador jud : team ){
            System.out.println("Mi nombre es: "+jud.getNombre()+" y tengo "+jud.getEdad()+" años.");
            Random rn = new Random();
            int nr = rn.nextInt(3);
            String uso;
            switch (nr){
                case 0:
                    uso = "";
                
                case 2:
                    uso = "con el pie";
                
                default :
                    uso = "con la mano";
            }
            jud.jugar(generarBalon(),uso);

        }
    }

    public  Balones  generarBalon(){
        Random rn = new Random();
        int nr = rn.nextInt(3);

        switch (nr){
            case 0:
                return new Futbol();

            case 1:
                return new Volley();

            default :
                return new Basqet();
        }   

    }
    
}