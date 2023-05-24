public class Retangulo extends Quadrilatero {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
