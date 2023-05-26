import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        Quadrado quadrado = new Quadrado(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Circulo circulo = new Circulo(3.0);

        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(circulo);

        for (FormaGeometrica forma : formas) {
            if (forma instanceof Quadrilatero) {
                Quadrilatero quadrilatero = (Quadrilatero) forma;
                System.out.println("Lados: " + quadrilatero.lado1 + ", " + quadrilatero.lado2 + ", " +
                        quadrilatero.lado3 + ", " + quadrilatero.lado4);
            } else if (forma instanceof Circulo) {
                Circulo circ = (Circulo) forma;
                System.out.println("Raio: " + circ.raio);
            }

            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
