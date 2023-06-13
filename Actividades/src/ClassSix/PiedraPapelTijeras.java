package ClassSix;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroRandom = (int) (Math.random()*3)+1;
        String opcionMaquina = "";
        String opcionUser;

        if (numeroRandom == 1){
            opcionMaquina = "piedra";
        }
        if (numeroRandom == 2){
            opcionMaquina = "papel";
        }
        if (numeroRandom == 3){
            opcionMaquina = "tijeras";
        }

        System.out.println("Juguemos a piedra, papel o tijeras");
        System.out.println("Elige tu opción: ");
        opcionUser = leer.nextLine().toLowerCase();

        if (opcionMaquina == opcionUser){
            System.out.println("Hubo un empate");
        }
        else{
            if (opcionMaquina.equals("piedra") && opcionUser.equals("papel")){
                System.out.println("El ganador es el usuario por que: "+
                        opcionUser+ " le gana a "+opcionMaquina);
            }
            if (opcionMaquina.equals("papel") && opcionUser.equals("piedra")){
                System.out.println("El ganador es la maquina por que: "+
                        opcionMaquina+ " le gana a "+opcionUser);
            }
            if (opcionMaquina.equals("tijeras") && opcionUser.equals("piedra")){
                System.out.println("El ganador es el usuario por que: "+
                        opcionUser+ " le gana a "+opcionMaquina);
            }
            if (opcionMaquina.equals("piedra") && opcionUser.equals("tijeras")){
                System.out.println("El ganador es la maquina por que: "+
                        opcionMaquina+ " le gana a "+opcionUser);
            }
            if (opcionMaquina.equals("papel") && opcionUser.equals("tijeras")){
                System.out.println("El ganador es el usuario por que: "+
                        opcionUser+ " le gana a "+opcionMaquina);
            }
            if (opcionMaquina.equals("tijeras") && opcionUser.equals("papel")){
                System.out.println("El ganador es la maquina por que: "+
                        opcionMaquina+ " le gana a "+opcionUser);
            }
        }
        System.out.println("¡Terminó el juego!");
    }
}
