package ejercicio2;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("Acontinuación se mostrarán tus datos de cuenta bancaria: ");
        System.out.println("Titular de la cuenta: "+ this.titular);
        System.out.println("Cantidad disponible en la cuenta: $ "+ this.cantidad);
    }

    public void ingresar(double cantidad){
        if (cantidad < 0 ){
            System.out.println("No se puede ingresar numero negativos");
        }
        else{
            System.out.println("La cantidad: $"+cantidad+ " fue ingresada con éxito.");
            cantidad+=cantidad;

        }
    }

    public void retirar(double cantidad){
        System.out.println("La cantidad: $"+cantidad+ " fue retirada con éxito.");
        cantidad-=cantidad;
    }
}
