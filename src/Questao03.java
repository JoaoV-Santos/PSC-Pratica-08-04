/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.
*/

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.print("\nMenu de opções:\n" +
                    "1. Média aritmética\n" +
                    "2. Média ponderada\n" +
                    "3. Sair\n" +
                    "Digite a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme a primeira nota: ");
                    double nota1 = in.nextDouble();
                    System.out.print("Informe a segunda nota: ");
                    nota1 += in.nextDouble();
                    System.out.println("\nA média aritmética é: " + nota1 / 2);
                    break;
                case 2:
                    System.out.print("\nInforme a primeira nota: ");
                    double x1 = in.nextDouble();
                    System.out.print("Informe o peso da primeira nota: ");
                    double p1 = in.nextDouble();
                    System.out.print("\nInforme a segunda nota: ");
                    double x2 = in.nextDouble();
                    System.out.print("Informe o peso da segunda nota: ");
                    double p2 = in.nextDouble();
                    System.out.print("\nInforme a terceira nota: ");
                    double x3 = in.nextDouble();
                    System.out.print("Informe o peso da terceira nota: ");
                    double p3 = in.nextDouble();

                    double x = (x1 * p1) + (x2 * p2) + (x3 * p3);
                    x = x / (p1 + p2 + p3);
                    System.out.println("\nA média ponderada é: " + x);
                    break;
                case 3:
                    System.out.println("\nFim do Programa!");
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcao != 3);


        in.close();
    }
}
