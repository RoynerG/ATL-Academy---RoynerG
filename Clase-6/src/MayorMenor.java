

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numOne = leer.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int numTwo = leer.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int numThree = leer.nextInt();

        if (numOne > numTwo && numOne > numThree){
            System.out.println("El número mayor es : "+numOne);
            if(numTwo < numOne && numTwo < numThree){
                System.out.println("El número menor es: "+numTwo);
            }else{
                System.out.println("El numero menor es: "+numThree);
            }
        }
        if (numTwo > numOne && numTwo > numThree){
            System.out.println("El número mayor es : "+numTwo);
            if(numOne < numTwo && numOne < numThree){
                System.out.println("El número menor es: "+numOne);
            }else{
                System.out.println("El numero menor es: "+numThree);
            }
        }
        if (numThree > numOne && numThree > numTwo){
            System.out.println("El número mayor es : "+numThree);
            if(numOne < numTwo && numOne < numThree){
                System.out.println("El número menor es: "+numOne);
            }else{
                System.out.println("El numero menor es: "+numTwo);
            }
        }
    }
}
