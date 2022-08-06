package basecamp.com.dio.metodos.sobreposicao.retorno;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio de Sobreposicao de Metodos.");

        double quadrado = Quadrilatero.calcularArea(3);
        System.out.println("Area do Quadrado: " + quadrado);

        double triangulo = Quadrilatero.calcularArea(3, 2);
        System.out.println("Area do Retangulo: " + triangulo);

        double trapezio = Quadrilatero.calcularArea(3, 3, 2);
        System.out.println("Area do Trapezio: " + trapezio);

    }
}
