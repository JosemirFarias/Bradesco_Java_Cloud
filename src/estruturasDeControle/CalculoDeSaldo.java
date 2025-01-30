package estruturasDeControle;

import java.util.Scanner;

public class CalculoDeSaldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = entrada.nextDouble();

        System.out.println("Digite as transações");
        double transacao1 = entrada.nextDouble();
        double transacao2 = entrada.nextDouble();
        double transacao3 = entrada.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.printf("%.2f", saldoFinal);

        entrada.close();
    }
}
