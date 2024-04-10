/*Foi feita uma estatística em n cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
nome da cidade;
número de veículos de passeio;
número de acidentes de trânsito com vítimas.
Deseja-se saber:
 qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
 qual é a média de veículos nas cinco cidades juntas
*/

import java.util.Arrays;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] cidades = new String[5];
        int[] carros = new int[5];
        int[] acidentes = new int[5];
        for (int i = 0; i < cidades.length; i++) {
            System.out.println("Informe o nome da cidade " + (i+1) + ": ");
            cidades[i] = in.nextLine();
            System.out.println("Informe o número de veículos de passeio da cidade " + (i+1) + ": ");
            carros[i] = in.nextInt();
            System.out.println("Informe o número de acidentes de trânsito com vítimas da cidade " + (i+1) + ": ");
            acidentes[i] = in.nextInt(); in.nextLine();
        }
        int maior = 0;
        String maiorCidade = null;
        int menor = 9999999;
        String menorCidade = null;
        int i = 0;

        for (int n : acidentes) {
            if (n > maior) {
                maior = n;
                maiorCidade = cidades[i];
            }
            i++;
        }
        i = 0;
        for (int n : acidentes) {
            if (n < menor) {
                menor = n;
                menorCidade = cidades[i];
            }
            i++;
        }
        System.out.println();
        System.out.println("Maior índice de acidentes de trânsito: " + maior + " - " + maiorCidade);
        System.out.println("Menor índice de acidentes de trânsito: " + menor + " - " + menorCidade);

        int mediaCarros = 0;
        for (int carro : carros) {
            mediaCarros += carro;
        }
        mediaCarros = mediaCarros / 5;
        System.out.println("\nA média de veículos nas 5 cidades juntas é: " + mediaCarros);

        in.close();
    }
}
