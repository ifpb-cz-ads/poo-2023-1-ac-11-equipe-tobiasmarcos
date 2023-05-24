public class Carro implements PegadaDeCarbono {
    private String marca;
    private String modelo;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getPegadaDeCarbono() {
        return consumoCombustivel * 2.3;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Pegada de Carbono " + getPegadaDeCarbono());
    }
}
