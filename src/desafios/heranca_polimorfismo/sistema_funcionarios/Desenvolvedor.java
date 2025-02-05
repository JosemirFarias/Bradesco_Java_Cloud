package desafios.heranca_polimorfismo.sistema_funcionarios;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {

        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase() * 1.1;
    }
}
