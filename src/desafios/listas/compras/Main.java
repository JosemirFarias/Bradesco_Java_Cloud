package desafios.listas.compras;

public class Main {
    public static void main(String[] args) {

        // Instância da classe Item.
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho.
        carrinho.adicionarItem("Celular", 2000.00, 2);
        carrinho.adicionarItem("Lápis", 2.00, 3);
        carrinho.adicionarItem("Lápis", 2.00, 3);
        carrinho.adicionarItem("Caderno", 35.00, 1);
        carrinho.adicionarItem("Borracha", 2.00, 2);

        // Exibindo os itens no carrinho
        carrinho.exibirItens();

        // Removendo um item do carrinho
        carrinho.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinho.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
    }
}
