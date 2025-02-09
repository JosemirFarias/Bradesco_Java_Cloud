package desafios.exerciciosInterfaces.automoveis;

public class Main {
    public static void main(String[] args) {

        Detalhes cr = new Carro();
        Detalhes mt = new Moto();
        Detalhes cm = new Caminhao();

        cr.cor();
        cr.quantidadePneus();
        cr.velocidadeMaxima();
        System.out.println("===================================");

        mt.cor();
        mt.quantidadePneus();
        mt.velocidadeMaxima();
        System.out.println("===================================");

        cm.cor();
        cm.quantidadePneus();
        cm.velocidadeMaxima();
    }
}
