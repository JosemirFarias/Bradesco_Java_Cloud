package desafios.heranca_polimorfismo.conta_bancaria;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int agencia, String nome, double saldo) {
        super(numero, agencia, nome, saldo);

    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Valor de R$ " + valor + " depositado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() - valor);
            System.out.println("Valor de R$ " + valor + " foi debitado sa sua conta!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Numero: " + getNumero());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}
