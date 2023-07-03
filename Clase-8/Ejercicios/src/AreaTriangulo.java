import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int MULTIPLICADOR = 2;
        int base;
        int altura;

        System.out.println("Calcula el area de un triangulo");
        System.out.println("Ingresa la base del tringulo: ");
        base = leer.nextInt();
        System.out.println("Ingresa la altura de triangulo: ");
        altura = leer.nextInt();

        CalcularArea(base,altura,MULTIPLICADOR);
    }

    public static void CalcularArea(int base, int altura, int operador){
        int total = (base * altura) / operador;
        System.out.println("El area del tringulo es de: " + total);
    }
}
