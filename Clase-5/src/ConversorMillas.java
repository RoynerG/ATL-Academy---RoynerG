
import java.util.Scanner;

public class ConversorMillas {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Bienvenido a la aplicacion para convertir de millas a KM");
    System.out.println("Ingrese una distancia en millas:");
    double millas = leer.nextDouble();
    double km = millas * 1.60934;
    System.out.println("La distancia en kilometros es: "+km);
  }
}
