import java.util.Scanner;

public class GeneradorContrasenas {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        String apellido;

        System.out.println("Ingresa tu nombre para crear tu contraseña: ");
        nombre = leer.nextLine();
        System.out.println("Ingresa tu apellido para crear tu contraseña: ");
        apellido = leer.nextLine();

        char nombreContrasena = nombre.charAt(0);
        char apellidoContrasena = apellido.charAt(0);

        String nombreGenerado = "" + nombreContrasena+apellidoContrasena;

        GenerarContrasena(nombreGenerado);
    }

    public static void GenerarContrasena (String nombreGenerado){
        int numeroAleatorio = (int) (Math.random()*1000000);
        String contrasenaAleatoria = nombreGenerado + numeroAleatorio;
        System.out.println("Su contraseña generada por nuestro sistema es: " + contrasenaAleatoria);
    }
}
