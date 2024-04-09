/*Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros termos da seguinte série: S = 1000 / 1 - 997 / 2 + 994 / 3 - 991 /
 4 + ...*/

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1000, d = 1;
        double s = 0;

        for (int i = 0; i < 50; i++) {
            s += n / d;

            if (n > 0) {
                n -= 3;
            }
            else {
                n += 3;
            }

            n *= -1;
            d += 1;
        }

        System.out.println("A soma dos primeiros 50 termos da série é " + s);


        in.close();
    }
}
