package desafios.heranca_polimorfismo.sistema_funcionarios;

import java.util.List;

public class FolhaPagamento {

    public static void exibir(List<Funcionario>funcionarios) {
        System.out.println("=======Folha de Pagamento=======");

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}
