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

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Valor de R$ " + valor + " foi debitado sa sua conta!");
            return true;
        }  else {
            System.out.println("Valor inválido!");
            return false;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Valor de R$ " + valor + " transferido com sucesso!");
        } else {
            System.out.println("Transferência falhou!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Numero: " + getNumero());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}
