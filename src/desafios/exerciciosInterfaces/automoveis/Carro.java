package desafios.exerciciosInterfaces.automoveis;

public class Carro implements Detalhes {
    @Override
    public void cor() {
        System.out.println("Carro Cor: Vermelho");
    }

    @Override
    public void quantidadePneus() {
        System.out.println("Quantidade pneus do Carro: 4 ");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("Velocidade maxima do Carro: 220 km/h " );
    }
}
