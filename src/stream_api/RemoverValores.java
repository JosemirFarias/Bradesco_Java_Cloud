package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverValores {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("números pares são: " + numerosPares);
    }
}
