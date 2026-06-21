/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class PapoDePescador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double multa = 4.00;
        double excesso = 0.00;
        double aPagar = 0.00;
        System.out.println("""
                ------------------------------------
                         RENDIMENTO DIÁRIO
                ------------------------------------""");

        System.out.println("Olá, João!");
        System.out.print("Por favor, digite quantos Kg de peixes você tem: ");

        double kgPeixes = sc.nextDouble();

        System.out.println("""
                ----------------------
                        RECIBO
                ----------------------""");
        if (kgPeixes <= 50.0) {
            System.out.println("Parabéns! Você está ISENTO de multas.");
            System.out.printf("Kg em excesso: %.1fKg%n", excesso);
            System.out.printf("Valor a pagar: R$%.2f%n", aPagar);
        } else {
            excesso = kgPeixes - 50.0;
            aPagar = excesso * multa;
            System.out.printf("Kg em excesso: %.1fKg%n", excesso);
            System.out.printf("Valor a pagar: R$%.2f%n", aPagar);

        }
        sc.close();
    }
}
