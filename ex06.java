import java.util.Scanner;

public class ex06 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        System.out.println("Digite as 5 notas do aluno:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        System.out.println("Digite os 5 pesos correspondentes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 0; i < 5; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaProdutos / somaPesos;

        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        scanner.close();
    }
}
