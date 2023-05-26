import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> objetos = new ArrayList<>();

        Edificio edificio = new Edificio("Rua A, 123", 10, 500.0);
        objetos.add(edificio);

        Carro carro = new Carro("Toyota", "Corolla", 10.5);
        objetos.add(carro);

        Bicicleta bicicleta = new Bicicleta("Caloi", "Mountain Bike");
        objetos.add(bicicleta);

        for (PegadaDeCarbono objeto : objetos) {
            if (objeto instanceof Edificio edif) {
                edif.exibirInformacoes();
            } else if (objeto instanceof Carro car) {
                car.exibirInformacoes();
            } else if (objeto instanceof Bicicleta bike) {
                bike.exibirInformacoes();
            }

            System.out.println();
        }
    }
}
