/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos.
 */

package vetores02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt();

        Pessoas[] vetor = new Pessoas[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.println();

            vetor[i] = new Pessoas(nome, idade, altura);
        }

        double alturaMedia = 0.00;
        for (int i = 0; i < vetor.length; i++) {
            alturaMedia += vetor[i].getAltura() / quantidade;
        }

        double menos16 = 0.00;
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                contador += 1;
            }
        }

        double porcentagem = ((double) contador / quantidade) * 100.00;

        System.out.printf("Altura média: %.2f", alturaMedia);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", porcentagem);

        sc.close();
    }
}
