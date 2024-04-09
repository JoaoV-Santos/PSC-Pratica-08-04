/*Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = 0;
        int idadeSoma = 0;
        int cont = 0;

        do {
            idade = 0;
            System.out.print("Insira a idade: ");
            idade = in.nextInt();
            idadeSoma += idade  ;

            if (idade != 0)
                cont++;

        } while (idade != 0);

        System.out.println();
        System.out.print("\nA média das idades informadas é " + (idadeSoma / cont));

        in.close();
    }
}
