/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        int qntPar = 0;

        System.out.println("PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if ((vect[i] % 2) == 0) {
                qntPar++;
                System.out.print(vect[i]+ " ");
            }
        }

        System.out.println("\nQUANTIDADE DE PARES: " + qntPar);
        sc.close();
    }
}
