package ejercicio1;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setId(1);
        persona1.setNombre("Royner Guardo");
        persona1.setEdad(24);
        persona1.setAnoNacimiento(1999);
        persona1.setDni("1143415938");
        persona1.mostrar();

        boolean respuesta = persona1.esMayorDeEdad();
        darRespuesta(respuesta);

    }

    public static void darRespuesta (boolean respuesta){
        if (respuesta){
            System.out.println("La persona ingresada es mayor de edad.");

        }
        else{
            System.out.println("La persona ingresada es menor de edad.");
        }
    }
}
