
import java.util.Scanner;

public class ChatWsp {
    public static void main(String[] args) {
        String LINK = "https://api.whatsapp.com/send?phone=";
        String number;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número: (Ej: 5493541539405)");
        number = leer.nextLine();

        System.out.println("Gracias por escribir tu número");
        System.out.println("Tu link de escribir un mensaje es: ");
        System.out.println(LINK+number);
    }
}
