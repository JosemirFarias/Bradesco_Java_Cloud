package estruturasDeControle;

import java.util.Scanner;

public class VerificarConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = entrada.nextDouble();

        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else {
            System.out.println("Confortavel");
        }

        entrada.close();
    }
}
