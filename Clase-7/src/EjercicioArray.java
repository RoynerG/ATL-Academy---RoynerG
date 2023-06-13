import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        Scanner leer = new Scanner(System.in);

        //Ingresar números
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un número: ");
            int numero = leer.nextInt();
            numeros[i] = numero;
        }

        //Mostrar números
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Número mayor y menor
        int numMayor = 0;
        int numMenor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numMayor == 0 || numeros[i] > numMayor) {
                numMayor = numeros[i];
            }
            if (numMenor == 0 || numeros[i] < numMenor) {
                numMenor = numeros[i];

            }
        }

        System.out.println("El numero menor es: " + numMenor);
        System.out.println("El número mayor es: " + numMayor);

        //Promedio
        double promedio = 0;
        for(int i = 0; i < numeros.length; i++){
            double sumNum = 0;
            sumNum += numeros[i];
            promedio += sumNum / numeros.length;
        }
        System.out.println("El promedio de los números ingresados es: "+promedio);
    }
}
