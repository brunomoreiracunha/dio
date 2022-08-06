package basecamp.com.dio.metodos;

public class Mensagem {

    public static void receberMensagem(int hora){
        if(hora >= 5 && hora <= 12 ){
            mensagemBomDia();
        } else if (hora >= 13 && hora <= 18) {
            mensagemBoaTarde();
        } else if (hora >= 19 && hora <= 4) {
            mensagemBoaNoite();
        }
    }
    
    public static void mensagemBomDia(){
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite!");
    }
}
