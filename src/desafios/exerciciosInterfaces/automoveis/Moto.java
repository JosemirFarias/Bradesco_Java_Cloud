package desafios.exerciciosInterfaces.automoveis;

public class Moto implements Detalhes{
    @Override
    public void cor() {
        System.out.println("Moto Cor: Preta");
    }

    @Override
    public void quantidadePneus() {
        System.out.println("Quantidade de pneus da Moto: 2");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("Velocidade maxima da Moto: 150 km/h");
    }
}
