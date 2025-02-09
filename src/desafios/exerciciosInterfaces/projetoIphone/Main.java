package desafios.exerciciosInterfaces.projetoIphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("====MÚSICA====");
        iphone.selecionarMusica("Qualquer música");
        iphone.tocar();
        iphone.pausar();

        System.out.println("====TELEFONE====");
        iphone.ligar("(99)99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("====INTERNET====");
        iphone.exibirPagina("http://www.DIO.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
