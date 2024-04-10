/*Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
4. Finalizar o programa
Digite a opção desejada.
*/

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu de opções:\n" +
                "1. Imposto\n" +
                "2. Novo salário\n" +
                "3. Classificação\n" +
                "4. Finalizar o programa\n" +
                "Digite a opção desejada.");

        int opcao = in.nextInt();
        System.out.println();
        double salario = 0;

        switch (opcao) {
            case 1:
                System.out.print("Informe o salário do funcionário: ");
                salario = in.nextDouble();
                double imposto  = 0;
                if (salario < 1400) {
                    System.out.println("\nImposto: 5%");
                    imposto = 0.05;
                }
                else if (salario >= 1400 && salario <= 2500) {
                    System.out.println("\nImposto: 10%");
                    imposto = 0.1;
                }
                else if (salario > 2500) {
                    System.out.println("\nImposto: 15%");
                    imposto = 0.15;
                }
                salario *= imposto;
                System.out.printf("Valor do imposto: R$ %.2f" , salario);
                break;
            case 2:
                System.out.print("Informe o salário do funcionário: ");
                salario = in.nextDouble();
                double aumento = 0;
                if (salario < 1400)
                    aumento = 100;
                else if (salario >= 1400 && salario < 2500)
                    aumento = 75;
                else if (salario >= 2500 && salario <= 5000)
                    aumento = 50;
                else if (salario > 5000)
                    aumento = 25;

                System.out.println("\nNovo salário: R$ " + (salario + aumento));
                break;
            case 3:
                System.out.print("Informe o salário do funcionário: ");
                salario = in.nextDouble();
                if (salario <= 1400)
                    System.out.println("Funcionário mal remunerado.");
                else
                    System.out.println("Funcionário bem remunerado.");
                break;
            case 4:
                System.out.println("Programa Encerrado!");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

        in.close();
    }
}
