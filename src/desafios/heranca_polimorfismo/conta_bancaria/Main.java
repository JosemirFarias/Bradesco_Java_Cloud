package desafios.heranca_polimorfismo.conta_bancaria;

public class Main {
    public static void main(String[] args) {

      ContaCorrente cc = new ContaCorrente(1, 123, "Josemir", 0);

      cc.imprimirExtrato();
      cc.depositar(100);
      cc.imprimirExtrato();
      cc.sacar(25);
      cc.imprimirExtrato();

      System.out.println("======================================");
    }
}
