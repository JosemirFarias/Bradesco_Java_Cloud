package desafios.listas.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributo
    private final List<Item> itensList;

    public CarrinhoDeCompras () {
        this.itensList = new ArrayList<>();
    }

    // Métodos
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itensList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item it : itensList) {
                if (it.nome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(it);
                }
            }
            itensList.removeAll(itensParaRemover);
        } else {
            System.out.println("Carrinho vazio!");
        }
    }

    public double calcularValorTotal() {
       double valorTotal = 0;
       if (!itensList.isEmpty()) {
           for (Item item : itensList) {
               double valorItem = item.preco() * item.quantidade();
               valorTotal += valorItem; // ValorTotal = valorTotal + valorItem.
           }
           return valorTotal;
       } else {
           throw new RuntimeException("Carrinho vazio!");
       }
    }

    public void exibirItens() {
        if (!itensList.isEmpty()) {
            System.out.println(itensList);
        } else {
            System.out.println("Carrinho está vazio!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itensList=" + itensList +
                '}';
    }
}
