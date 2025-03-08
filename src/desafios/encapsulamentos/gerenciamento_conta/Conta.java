package desafios.encapsulamentos.gerenciamento_conta;

import java.util.Scanner;

public class Conta {

// Implemente os atributos privados para garantir que só podem ser acessados dentro da classe:
    private String titular;
    private int numeroConta;
    private double saldoInicial;

// Crie o construtor para inicializar os atributos da conta:
    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

// Adicione o metodo público para consultar o saldo:
    public double consultarSaldo() {
        return saldoInicial;
    }

// Adicione o metodo público para realizar saque:
    public boolean sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldoInicial) {
            saldoInicial -= valorSaque;
            return true;
        } else {
            return false;
        }
    }

// Crie o metodo público para realizar depósito
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldoInicial += valorDeposito;
        } else {
            System.out.println("Valor inválido!");
        }
    }

// Metodo Main para rodar o programa.
    public static class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String titular = sc.nextLine();
            System.out.println("Número da conta: ");
            int numeroConta = sc.nextInt();
            System.out.println("Digite seu saldo: ");
            double saldoInicial = sc.nextDouble();

            Conta conta = new Conta(titular, numeroConta, saldoInicial);

            // Operações de depósito e saque.
            System.out.println("Valor do saque: ");
            if (sc.hasNextDouble()) {
                double valorSaque = sc.nextDouble();
                if (!conta.sacar(valorSaque)) {
                    System.out.println("Saque inválido: Saldo insuficiente");
                    System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
                    return;
                }
            }

            System.out.println("Valor do depósito: ");
            if (sc.hasNextDouble()) {
                double valorDeposito = sc.nextDouble();
                conta.depositar(valorDeposito);
            }

            // Imprime o saldo final atualizado
            System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

            sc.close();
        }
    }
}
