public class Circulo implements FormaGeometrica {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
