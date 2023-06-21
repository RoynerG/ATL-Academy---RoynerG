import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el lado para calcular: ");
        int lado = leer.nextInt();

        CalcularArea(lado);

    }

    public static void CalcularArea (int a){
        int areaTotal = a * a;
        System.out.println("El area del cuadrado es: "+areaTotal);
    }
}
