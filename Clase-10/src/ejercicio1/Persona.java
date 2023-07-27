package ejercicio1;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private int anoNacimiento;
    private String dni;

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Datos de la persona: ");
        System.out.println("ID: " + this.id);
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("EDAD: " + this.edad);
        System.out.println("AÑO DE NACIMIENTO: " + this.anoNacimiento);
        System.out.println("DNI: " + this.dni);
    }

    public boolean esMayorDeEdad() {
        boolean respuesta;
        if (this.edad > 18) {
            respuesta = true;
        } else {
            respuesta = false;
        }

        return respuesta;
    }
}
