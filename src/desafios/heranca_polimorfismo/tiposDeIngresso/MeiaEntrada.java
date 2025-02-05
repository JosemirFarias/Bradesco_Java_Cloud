package desafios.heranca_polimorfismo.tiposDeIngresso;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String filme, boolean legendado, boolean dublado) {
        super(valor, filme, legendado, dublado);
    }

    @Override
    public double getValorReal() {
        return valor / 2;
    }
}
