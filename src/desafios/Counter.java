package desafios;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] valores = new double[3];

        System.out.println("Digite 4 valores, o quarto valor corresponderá ao valor mínimo definido pelo usuário: ");

        for (int i = 0; i < 3; i++) {
            valores[i] = entrada.nextDouble();
        }
        double minimo = entrada.nextDouble();

        int conta = 0;
        for (double valor : valores) {
            if (valor > minimo) {
                conta++;
            }
        }
        System.out.println(conta);



        entrada.close();
    }
}
