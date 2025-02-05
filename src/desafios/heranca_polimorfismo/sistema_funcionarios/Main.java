package desafios.heranca_polimorfismo.sistema_funcionarios;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Ana", 10.000);
        Funcionario dev = new Desenvolvedor("Bob", 5.000);
        Funcionario estagiario = new Estagiario("Pedro", 2.000);

        List<Funcionario> funcionarios = List.of(gerente, dev, estagiario);

        FolhaPagamento.exibir(funcionarios);
    }
}
