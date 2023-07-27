package ejercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {

        //Declaraciones
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        Boolean bandera = true;

        //Titular
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        cuenta1.setTitular(nombre);

        //Menu
        while (bandera){
            System.out.println("MENU PRINCIPAL\n1.Mostrar datos\n2.Ingresar dinero\n3.Retirar dinero");
            menuPrincipal(cuenta1);
            System.out.println("¿Deseas seguir con el programa? Si/No");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                bandera = true;
            }
            else{
                bandera = false;
            }
        }
        System.out.println("Gracias por usar nuestro programa:3\n¡Programa finalizado!");

    }

    public static void menuPrincipal(Cuenta cuenta1){
        Scanner leer = new Scanner(System.in);
        int opcionUser = leer.nextInt();
        double cantidad;
        switch (opcionUser){
            case 1:
                cuenta1.mostrar();
                break;
            case 2:
                System.out.println("Ingresa la cantidad que deseas agregar a la cuenta: ");
                cantidad = leer.nextDouble();
                cuenta1.setCantidad(cantidad);
                cuenta1.ingresar(cantidad);
                break;
            case 3:
                cuenta1.getCantidad();
                System.out.println("Ingresa la cantidad que deseas retirar de la cuenta: ");
                cantidad = leer.nextDouble();
                cuenta1.retirar(cantidad);
                break;
        }
    }
}
