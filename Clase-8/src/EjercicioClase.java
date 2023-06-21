import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        String [] personas = {"Royner Guardo","Dina Robles","Jesus Robles"};

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su busqueda: ");
        String busqueda = leer.nextLine();

        for (String nombrePersona : personas){
            if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("Persona encontrada: "+nombrePersona);
            }
            }
        }

    }
