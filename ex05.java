import java.util.Scanner;

public class ex05 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }
        System.out.println("O número " + n + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}
