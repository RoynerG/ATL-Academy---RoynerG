package ClassFive;
import java.util.Scanner;

public class CalculadoraPropinas {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa la cuenta total de su comida: ");
    double totalCuenta = leer.nextDouble();
    System.out.println("Ingrese el porcentaje de propina que desee dar: ");
    double porcentajePropina = leer.nextDouble();
    double propina = totalCuenta * (porcentajePropina / 100);
    System.out.println("La propina total que dará al mesero es de: "+propina);

  }
}
