import java.util.Scanner;

public class JuegoPiedraPapel {
    public static void main(String[] args) {

        int contadorUser = 0;
        int contadorMaquina = 0;
        int opcionUser = obtenerOpcionUsuario();
        int opcionMaquina = obtenerOpcionMaquina();

        while (contadorUser < 3 && contadorMaquina < 3){


        }
        System.out.println("El juego ha terminado.");

        if (contadorUser == 3){
            System.out.println("El ganador del juego ha sido el USUARIO.");
        }else{
            System.out.println("El ganador del juego ha sido la MAQUINA.");
        }

    }

    public static int obtenerOpcionUsuario (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu opción para jugar: \n1. Piedra\n2. Papel\n3. Tijera ");
        int opcionUser = leer.nextInt();
        return opcionUser;
    }

    public static int obtenerOpcionMaquina (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu opción para jugar: \n1. Piedra\n2. Papel\n3. Tijera ");
        int opcionMaquina = leer.nextInt();
        return opcionMaquina;
    }

    public static void Validador (int opcionUsuario ){

    }
}


