package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarPositivos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> positivo = n -> n > 0;

        boolean ehPositivo = numeros.stream()
                .allMatch(positivo);

        System.out.println("Todos são positivos? " + ehPositivo);

    }
}
