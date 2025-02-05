package desafios.heranca_polimorfismo.sistema_funcionarios;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salarioBase = salario;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSalarioBase() {

        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {

        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Cargo: " + getClass().getSimpleName() + " | Salário: " + calcularSalario());
    }
}
