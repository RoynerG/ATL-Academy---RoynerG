import java.util.Scanner;

public class CalculadoraDescuento {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Aplicacio para calcular el descuento de un producto");
    System.out.println("---------------------------------------------------");
    System.out.println("Ingrese el precio original del producto: ");
    double precio = leer.nextDouble();
    System.out.println("Ingrese el procentaje que desea aplicar al producto: ");
    double descuento = leer.nextInt();
    double precioFinal = precio - (precio * (descuento / 100));
    System.out.println("El precio final del producto es: "+precioFinal);
  }
}
