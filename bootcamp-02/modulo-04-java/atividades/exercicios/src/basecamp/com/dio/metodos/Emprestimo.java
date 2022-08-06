package basecamp.com.dio.metodos;

public class Emprestimo {

    public static void calcularValor(double valor, int parcelas){
        double valorTotal;
        switch (parcelas){
            case 2:
                valorTotal = valor + (valor * getTaxaDuasParcelas());
                System.out.println("O valor total do empréstimo para 2 parcelas: R$ " + valorTotal);
                break;
            case 3:
                valorTotal = valor + (valor * getTaxaTresParcelas());
                System.out.println("O valor total do empréstimo para 2 parcelas: R$ " + valorTotal);
                break;
            case 4:
                valorTotal = valor + (valor * getTaxaQuatroParcelas());
                System.out.println("O valor total do empréstimo para 2 parcelas: R$ " + valorTotal);
                break;
            default:
                System.out.println("A quantidade de parcelas é invalida");
                break;
        }
    }

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static int getQuatroParcelas(){
        return 4;
    }
    public static double getTaxaDuasParcelas(){
        return 0.1;
    }
    public static double getTaxaTresParcelas(){
        return 0.2;
    }
    public static double getTaxaQuatroParcelas(){
        return 0.3;
    }
}
