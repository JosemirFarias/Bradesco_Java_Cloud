package desafios.exerciciosInterfaces.mensagem;

public class WhatsappMensagem implements MensagemMarketing {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por WHATSAPP: " + mensagem);
    }
}
