package desafios.exerciciosInterfaces.automoveis;

public class Caminhao implements Detalhes{
    @Override
    public void cor() {
        System.out.println("Caminhão Cor: Branco ");
    }

    @Override
    public void quantidadePneus() {
        System.out.println("Quantidade pneus do Caminhão: 22");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("Velocidade maxima do Caminhão: 140 km/h");
    }
}
