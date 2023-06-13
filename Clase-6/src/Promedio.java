
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numOne = leer.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int numTwo = leer.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int numThree = leer.nextInt();

        double promedio = (numOne+numTwo+numThree)/3;

        System.out.println("El promedio de los 3 número ingresados es: "+promedio);


    }
}
