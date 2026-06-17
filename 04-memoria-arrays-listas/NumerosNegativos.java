/*
Faça um programa que leia um número inteiro positivo N e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int resposta = sc.nextInt();

        int[] vect = new int[resposta]; //Declaração do vetor

        for (int i = 0; i < resposta; i++) { //Preencher o vetor
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: " );
        for (int i = 0; i < resposta; i++) { //Valores negativos
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
            sc.close();
        }
    }
