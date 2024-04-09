/*Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
a média das idades das dez pessoas;
a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e
a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] idades = new int[10];
        double[] pesos = new double[10];
        int[] alturas = new int[10];
        int idadeSoma = 0;
        int pessoasPeso = 0, pessoasIdade = 0, pessoasAltura = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Informe a " + (i+1) + "ª idade: ");
            idades[i] = in.nextInt();
            idadeSoma += idades[i];

            System.out.print("Informe o " + (i+1) + "º peso: ");
            pesos[i] = in.nextInt();

            System.out.print("Informe a " + (i+1) + "ª altura: ");
            alturas[i] = in.nextInt();
            System.out.println();

            if (pesos[i] > 90 && alturas[i] < 150) {
                pessoasPeso++;
            }

            if (alturas[i] > 190) {
                pessoasAltura++;
            }

            if (alturas[i] > 190 && idades[i] > 10 && idades[i] < 30) {
                pessoasIdade++;
            }

        }

        double mediaIdade = (double) idadeSoma / idades.length;


        System.out.println("\nA média de idade das pessoas é " + mediaIdade + " anos.");
        System.out.println("Há " + pessoasPeso + " pessoas com peso superior a 90 kg e altura inferior a 1,50 metro.");
        System.out.println((pessoasIdade * 100) / pessoasAltura + "% das pessoas com mais de 1,90m têm entre 10 e 30 anos.");
    }
}
