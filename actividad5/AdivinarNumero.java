import java.util.Scanner;
public class AdivinarNumero {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Bienvenido al juego donde debes adivinar un numero!");
    int numAdivinar = (int) (Math.random() * 100 + 1);
    System.out.println("Ingresa un número: ");
    int num = leer.nextInt();
    if (num == numAdivinar) {
      System.out.println("El numero que ingresaste es correcto🤟 " + "El numero aleatorio fue: " + numAdivinar);
    }
    else {
      System.out.println("El numero que ingresaste es incorrecto🚩 " + "El numero aleatorio fue: " + numAdivinar);
    }
  }
}
