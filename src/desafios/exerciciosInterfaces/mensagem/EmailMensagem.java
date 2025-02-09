package desafios.exerciciosInterfaces.mensagem;

public class EmailMensagem implements MensagemMarketing {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por EMAIL: " + mensagem);
    }
}
