import java.util.Scanner;

public class ex02 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

       
        double[] numeros = new double[tamanho];

        System.out.println("Digite os números:");

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }

       
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > 0) {
                System.out.println("O número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("O número na posição " + i + " é negativo.");
            } else {
                System.out.println("O número na posição " + i + " é zero.");
            }
        }

        scanner.close();
    }
}