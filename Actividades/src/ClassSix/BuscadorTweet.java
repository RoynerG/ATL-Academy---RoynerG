package ClassSix;

import java.util.Scanner;

public class BuscadorTweet {
    public static void main(String[] args) {
        String LINK = "https://twitter.com/search?q=";
        String user;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un usuario: (Ej: Messi)");
        user = leer.nextLine();

        System.out.println("Gracias por escribir tu user");
        System.out.println("Tu link de acceso es: ");
        System.out.println(LINK+user);
    }
}
