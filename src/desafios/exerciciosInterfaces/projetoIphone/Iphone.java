package desafios.exerciciosInterfaces.projetoIphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos da função reproduzir música.
    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: " + musica);
    }

    // Métodos da função telefone.
    @Override
    public void ligar(String numero) {
        System.out.println("Ligado para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado...");
    }

    //Métodos da função internet.
    @Override
    public void exibirPagina(String url) {
        System.out.println("Página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
