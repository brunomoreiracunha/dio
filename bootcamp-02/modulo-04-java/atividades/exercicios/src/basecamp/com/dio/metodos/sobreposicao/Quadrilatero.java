package basecamp.com.dio.metodos.sobreposicao;

public class Quadrilatero {
	
	public static void calcularArea(double lado) {
		
		System.out.println("A Área do Quadrado: " + lado * lado);
		
	}
	
	public static void calcularArea(double lado1, double lado2) {
		
		System.out.println("A Área do Quadrado: " + lado1 * lado2);
		
	}
	public static void calcularArea(double baseMaior, double baseMenor, double altura) {
		
		System.out.println("A Área do Quadrado: " + ((baseMaior + baseMenor)*altura)/2);
		
	}
}
