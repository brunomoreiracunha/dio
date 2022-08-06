package basecamp.com.dio.metodos;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora");
        
        Calculadora.adicao(1,3);
        Calculadora.subtracao(5,3);
        Calculadora.multiplicacao(4,3);
        Calculadora.divisao(15,3);

        System.out.println("Exercicio Mensagem do Dia");
        
        Mensagem.receberMensagem(9);
        Mensagem.receberMensagem(2);
        Mensagem.receberMensagem(13);
        Mensagem.receberMensagem(20);

        System.out.println("Exercicio Emprestimo");
        
        Emprestimo.calcularValor(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularValor(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcularValor(2000, Emprestimo.getQuatroParcelas());
        Emprestimo.calcularValor(5000, 5);
    }
}
