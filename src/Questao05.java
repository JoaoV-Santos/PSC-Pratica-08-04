/*Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso, forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:
 o número de pessoas que responderam sim;
o número de pessoas que responderam não;
o número de mulheres que responderam sim; e
a percentagem de homens que responderam não, entre todos os homens analisados
*/

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pessoasSim = 0, pessoasNao = 0, mulheresSim = 0, homens = 0, homensNao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe seu sexo (M ou F): ");
            char sexo = in.next().charAt(0);
            System.out.print("Informe sua resposta (S ou N): ");
            char resposta = in.next().charAt(0);
            System.out.println();

            if (resposta == 'S')
                pessoasSim++;
            else if (resposta == 'N')
                pessoasNao++;

            if (sexo == 'F' && resposta == 'S')
                mulheresSim++;

            if (sexo == 'M')
                homens++;

            if (sexo == 'M' && resposta == 'N')
                homensNao++;
        }

        System.out.println();
        System.out.println(pessoasSim + " pessoas responderam Sim.");
        System.out.println(pessoasNao + " pessoas responderam Não.");
        System.out.println(mulheresSim + " mulheres responderam Sim.");
        System.out.println(homensNao * 100 / homens + "% dos homens responderam Não.");


        in.close();
    }
}
