public class Bicicleta implements PegadaDeCarbono {
    private String marca;
    private String modelo;

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPegadaDeCarbono() {
        return 0.0;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Pegada de Carbono " + getPegadaDeCarbono());
    }
}
