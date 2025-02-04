package desafios.heranca_polimorfismo.tiposDeIngresso;

public class IngressoFamilia extends Ingresso {
    private final int numeroDePessoas;

    public IngressoFamilia(double valor, String filme, boolean legendado, boolean dublado, int numeroDePessoas) {
        super(valor, filme, legendado, dublado);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroDePessoas;

        if(numeroDePessoas > 3) {
            total *= 0.95;
        }

        return total;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }
}
