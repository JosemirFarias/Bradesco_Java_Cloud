package desafios.exerciciosInterfaces.mensagem;

public class Main {
    public static void main(String[] args) {

        MensagemMarketing sms = new SmsMensagem();
        MensagemMarketing em = new EmailMensagem();
        MensagemMarketing whats = new WhatsappMensagem();

        sms.enviar("Bom dia.");
        em.enviar("Bom dia.");
        whats.enviar("Bom dia.");
    }
}
