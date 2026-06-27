/*
Faça um programa que receba dois números inteiros e gere os
números inteiros no intervalo compreendido por eles.
 */
package exercicios_loianeGroner;

import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o primero número: ");
        int num1 = sc.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num2 = sc.nextInt();



        sc.close();
    }
}
