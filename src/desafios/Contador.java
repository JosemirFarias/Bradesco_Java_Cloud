package desafios;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try (entrada) {
            System.out.println("Digite o primeiro parâmentro: ");
            int parametro1 = entrada.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametro2 = entrada.nextInt();
            contar(parametro1, parametro2);
        } catch (InvalidParameterException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws InvalidParameterException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametro1 >= parametro2) {
            throw new InvalidParameterException();
        }
        int contagem = parametro2 - parametro1;

        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("O valor da contagem foi " + (i + 1));
        }
    }
}
