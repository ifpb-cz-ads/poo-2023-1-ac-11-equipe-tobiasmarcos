public class Edificio implements PegadaDeCarbono {
    private String endereco;
    private int numeroAndares;
    private double consumoEnergia;

    public Edificio(String endereco, int numeroAndares, double consumoEnergia) {
        this.endereco = endereco;
        this.numeroAndares = numeroAndares;
        this.consumoEnergia = consumoEnergia;
    }

    public double getPegadaDeCarbono() {
        return consumoEnergia * 0.5;
    }

    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de andares: " + numeroAndares);
        System.out.println("Pegada de Carbono " + getPegadaDeCarbono());
    }
}
