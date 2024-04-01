import java.util.Scanner;

public class ex11 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < A.length; i++) {
            produtoEscalar += A[i] * B[i];
        }

       
        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);

        scanner.close();
    }
}
