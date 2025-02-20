package desafios.listas.compras;

public record Item(String nome, double preco, int quantidade) {

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}


/*classe Item pode ser transformada em um record, pois ela é imutável e apenas contém atributos com métodos getters
sem comportamento adicional.

- Menos código: Remove construtor, getters e toString().
- Imutabilidade garantida: Os atributos são final por padrão.
- Melhor legibilidade: O código fica mais limpo e fácil de entender.*/