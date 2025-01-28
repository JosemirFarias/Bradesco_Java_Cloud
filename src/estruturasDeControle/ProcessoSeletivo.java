package estruturasDeControle;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Ana", "Paulo", "Julia", "Bia"};
        System.out.println("Imprimdo a lista de candidatos");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i+1) + ": " + candidatos[i]);
        }
        System.out.println("Forma abreviada for each");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Ana", "Paulo", "Julia", "Bia", "Jão", "Pedro", "María", "Marcia", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatosTotal = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosTotal < candidatos.length) {
            String candidato = candidatos[candidatosTotal];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " tem salario R$ " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado com sucesso!");
                candidatosSelecionados ++;
            }
            candidatosTotal ++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}

