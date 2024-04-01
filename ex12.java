import java.util.Scanner;

public class ex12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) { 
                produto *= vetor[i];
            }
        }

        if (produto == 1) {
            System.out.println("Não existem elementos pares positivos no vetor.");
        } else {
            System.out.println("O produto dos elementos pares positivos é: " + produto);
        }

        scanner.close();
    }
}