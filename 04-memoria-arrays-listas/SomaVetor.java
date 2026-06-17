import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) { //ARMAZENAR VALORES
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i++) { //MOSTRAR VALORES
            System.out.print(vetor[i] + "   ");
        }

        double soma = 0.00;

        for (int i = 0; i < vetor.length; i++) { //CALCULO
            soma += vetor[i];
        }

        System.out.println();

        double media = soma / vetor.length;
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
