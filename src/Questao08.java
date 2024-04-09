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
