

import java.util.Scanner;

public class Cuento {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //variables
        Integer aventura;
        Integer caminoAventuraOne;
        Integer caminoAventuraTwo;
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        System.out.println("Elige tu aventura: ");
        aventura = leer.nextInt();
        if (aventura == 1) {
            System.out.println("Decides explorar la oscuridad. al llegar a la fuente te da curiosidad y tienes dos cosas por hacer: \n" +
                    "1) Uir del bosque. \n" +
                    "2) Investigar la fuente llena de grandes tesoros.\n");
            caminoAventuraOne = leer.nextInt();
            if (caminoAventuraOne == 1) {
                System.out.println("Uiste del bosque y saliste feliz.");
            } else {
                System.out.println("Exploraste la fuente y lograste llevar muchos tesos a tu casa");
            }
        }
        if (aventura == 2) {
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n");
            caminoAventuraOne = leer.nextInt();
            if (caminoAventuraOne == 1) {
                System.out.println("Entras por la puerta de la izquierda y encuentras grandiosas pinturas.");
            } else {
                System.out.println("Optas por la puerta de la derecha donde hay muchos mounstros y te atrapan.");
            }
        }


    }
}