

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        String LINK = "https://www.google.com/maps/search/";
        String pais;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un pais: (Ej: Colombia)");
        pais = leer.nextLine();

        System.out.println("Gracias por escribir tu pais");
        System.out.println("Tu link de acceso es: ");
        System.out.println(LINK+pais);

    }
}
