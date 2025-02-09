package desafios.exerciciosInterfaces.mensagem;

public class SmsMensagem implements MensagemMarketing {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }
}

