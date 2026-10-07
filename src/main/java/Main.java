
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i, num, meV = 0, maV = 0, soma = 0;
        double media;

        System.out.println("Quantos números ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i = i + 1) {
            System.out.println("Digite o número :");
            num = scanner.nextInt();
            soma = soma + num;
            if (i == 1) {
                meV = num;
                maV = num;
            } else {
                if (num < meV) {
                    meV = num;
                }
                if (num > maV) {
                    maV = num;
                }
            }

        }
        media = soma / n;
        System.out.println("Menor " + meV);
        System.out.println("Maior " + maV);
        System.out.println("Soma " + soma);
        System.out.println("Média " + media);
    }
}
