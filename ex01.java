import java.util.Scanner;

public class ex01{

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        
        double[] valores = new double[5];

       
        System.out.println("Digite 5 números:");

      
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            valores[i] = scanner.nextDouble();
        }


        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double media = soma / valores.length;

        System.out.println("A média dos valores é: " + media);

       
        System.out.println("Valores menores que a média:");
        for (double valor : valores) {
            if (valor < media) {
                System.out.println(valor);
            }
        }

        System.out.println("Valores iguais à média:");
        for (double valor : valores) {
            if (valor == media) {
                System.out.println(valor);
            }
        }

        System.out.println("Valores superiores à média:");
        for (double valor : valores) {
            if (valor > media) {
                System.out.println(valor);
            }
        }

        scanner.close();
    }
}
