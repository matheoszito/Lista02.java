import java.util.Scanner;

public class ex07 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);


        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

      
        System.out.println("Digite os elementos do primeiro vetor:");

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

   
        System.out.println("Digite os elementos do segundo vetor:");

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

     
        boolean saoIguais = true;

        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }


        if (saoIguais) {
            System.out.println("Os dois vetores são iguais.");
        } else {
            System.out.println("Os dois vetores não são iguais.");
        }

        scanner.close();
    }
}
