package desafios.heranca_polimorfismo.conta_bancaria;

public class Main {
    public static void main(String[] args) {

      ContaCorrente cc = new ContaCorrente(1, 123, "Josemir", 1000);
      ContaPoupanca cp = new ContaPoupanca(1, 123, "Josemir", 500);

        System.out.println(" ");

        System.out.println("==================corrente====================");
        cc.imprimirExtrato();
        System.out.println("==================poupança====================");
        cp.imprimirExtrato();

        cp.transferir(100, cc);

        System.out.println("==================corrente====================");
        cc.imprimirExtrato();
        System.out.println("==================poupança====================");
        cp.imprimirExtrato();


    }
}
