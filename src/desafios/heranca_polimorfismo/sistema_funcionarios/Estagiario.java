package desafios.heranca_polimorfismo.sistema_funcionarios;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {

        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase();
    }
}
