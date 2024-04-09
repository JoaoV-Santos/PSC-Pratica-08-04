/*Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, fazer um algoritmo, utilizando o comando para ... faça, para gerar o número H. O número N é lido através de uma
unidade de entrada qualquer uma única vez. */

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor de N: ");
        double n = in.nextDouble();
        double h = 0;

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        System.out.println("H = " + h);


        in.close();
    }
}
