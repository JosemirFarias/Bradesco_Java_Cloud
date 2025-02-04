package desafios.heranca_polimorfismo.tiposDeIngresso;

public class Ingresso {

    protected double valor;
    private String filme;
    private boolean legendado;
    private boolean dublado;

    public Ingresso(double valor, String filme, boolean legendado, boolean dublado) {
        this.valor = valor;
        this.filme = filme;
        this.legendado = legendado;
        this.dublado = dublado;
    }

    public double getValorReal() {
        return valor;
    }

    public void setValorReal(double valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }
}
