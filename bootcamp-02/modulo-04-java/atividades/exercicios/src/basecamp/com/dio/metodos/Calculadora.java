package basecamp.com.dio.metodos;

public class Calculadora {

    public static void adicao(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A adição dos números: "+ numero1 +" + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração dos números: "+ numero1 +" - " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão dos números: "+ numero1 +" / " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação dos números: "+ numero1 +" * " + numero2 + " = " + resultado);
    }
}
