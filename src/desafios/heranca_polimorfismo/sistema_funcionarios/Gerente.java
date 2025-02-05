package desafios.heranca_polimorfismo.sistema_funcionarios;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {

        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase() * 1.2;
    }
}

