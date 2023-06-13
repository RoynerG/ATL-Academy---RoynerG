package ClassFive;
import java.util.Scanner;

public class CalculadoraEdadPerros {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa la edad de tu perro: ");
    int edad = leer.nextInt();
    int edadPerro = edad * 7;
    System.out.println("La edad de tu perro es: "+edadPerro);
    
    }
}