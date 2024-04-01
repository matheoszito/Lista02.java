import java.util.Scanner;

public class ex04 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        System.out.println("Índices dos elementos inferiores a " + n + ":");

        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}