/*Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO.
*/

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int canal = 0, pessoas = 0, pessoasTotal = 0;
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;

        do {
                System.out.print("Informe o número do canal que está sendo assistido (4, 5, 7 ou 12): ");
                canal = in.nextInt();
                if (canal == 0)
                    break;

                System.out.print("Informe a quantidade de pessoas assistindo TV: ");
                pessoas = in.nextInt();

                pessoasTotal = pessoasTotal + pessoas;

                switch (canal) {
                    case 4:
                        canal4 += pessoas;
                        break;
                    case 5:
                        canal5 += pessoas;
                        break;
                    case 7:
                        canal7 += pessoas;
                        break;
                    case 12:
                        canal12 += pessoas;
                        break;
                    default:
                        System.out.println("\nCanal Inválido!");
                }
            } while (canal != 0);
        canal4 = canal4 * 100 / pessoasTotal;
        canal5 = canal5 * 100 / pessoasTotal;
        canal7 = canal7 * 100 / pessoasTotal;
        canal12 = canal12 * 100 / pessoasTotal;

        System.out.println("\nAudiência do Canal 4: " + canal4 + "%");
        System.out.println("Audiência do Canal 5: " + canal5 + "%");
        System.out.println("Audiência do Canal 7: " + canal7 + "%");
        System.out.println("Audiência do Canal 12: " + canal12 + "%");

        in.close();
    }
}
