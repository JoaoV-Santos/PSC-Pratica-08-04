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
