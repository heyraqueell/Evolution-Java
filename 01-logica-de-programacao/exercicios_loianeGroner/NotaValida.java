/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */
package exercicios_loianeGroner;

import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;
        double nota;

        do {
            System.out.print("Entre com uma nota de 0-10: ");
            nota = sc.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                notaValida = true;
                System.out.print("A nota que você digitou é: " + nota);
            } else {
                System.out.println("DIGITE UM VALOR VÁLIDO");
            }
        } while (!notaValida);

        sc.close();
    }

}
