public class Pato extends Ave implements Nadador{
    @Override
    public void nadar() {
        System.out.println("Nada bien");
    }

    @Override
    public void aletear() {
        System.out.println("Tira unas aletas");
    }

    @Override
    public void planear() {
        System.out.println("Va a volar mas o menos");
    }
}
