package desafios.heranca_polimorfismo.tiposDeIngresso;

public class App {
    public static void main(String[] args) {

        Ingresso ingressoNormal = new Ingresso(30, "teste", false, true);
        IngressoFamilia ingressoFamilia1 = new IngressoFamilia(30, "teste", false, true, 4);
        MeiaEntrada meiaEntrada = new MeiaEntrada(30,"teste", false, true);

        System.out.println("Ingresso normal: " + ingressoNormal.getValorReal());
        System.out.println("Ingresso familia1 com 5% de desconto: " + ingressoFamilia1.getValorReal());
        System.out.println("Ingresso meiaEntrada: " + meiaEntrada.getValorReal());
    }
}
