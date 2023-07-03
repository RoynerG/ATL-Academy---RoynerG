import java.util.Scanner;

public class JuegoPiedraPapel {
    public static void main(String[] args) {

        int contadorUser = 0;
        int contadorMaquina = 0;

        while (contadorUser <= 3 && contadorMaquina <= 3){
            int opcionUser = obtenerOpcionUsuario();
            int opcionMaquina = obtenerOpcionMaquina();
            System.out.println("Tu opción: " + opcionUser);
            System.out.println("Opción de la maquina: "+ opcionMaquina);
                if (opcionUser == opcionMaquina ){
                    System.out.println("Hay empate");
                    contadorMaquina++;
                    contadorUser++;
                }
                else if(opcionUser == 1 && opcionMaquina == 3){
                    contadorUser++;
                }
                else if(opcionUser == 3 && opcionMaquina == 2){
                    contadorUser++;
                }
                else if(opcionUser == 2 && opcionMaquina == 1){
                    contadorUser++;
                }
                else if (opcionMaquina == 3 && opcionUser == 1) {
                    contadorMaquina++;
                }
                else if (opcionMaquina == 2 && opcionUser == 3) {
                    contadorMaquina++;
                }
                else if (opcionMaquina == 1 && opcionUser == 2) {
                    contadorMaquina++;
                }
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
        int opcionMaquina = (int) (Math.random() * 3) + 1;
        return opcionMaquina;
    }
}


