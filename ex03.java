import java.util.Scanner;

public class ex03 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

       
        double[] vetorOriginal = new double[tamanho];

       
        System.out.println("Digite os números:");

       
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetorOriginal[i] = scanner.nextDouble();
        }

     
        double[] vetorDobro = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("Valores do vetor com o dobro de cada número:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetorDobro[i]);
        }

        scanner.close();
    }
}
