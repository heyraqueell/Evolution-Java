/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo.
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTriplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite DOIS números INTEIROS e UM número REAL: ");
        int inteiro1 = sc.nextInt();
        int inteiro2 = sc.nextInt();
        double real3 = sc.nextDouble();

        double calculo1 = (inteiro1 * 2) * ((double) inteiro2 / 2);
        double calculo2 = (inteiro1 * 3) + real3;
        double calculo3 = real3 * real3 * real3;

        System.out.println();
        System.out.println("O produto do dobro de " + inteiro1 + " com a metade de " + inteiro2 + " = " + calculo1);
        System.out.println("A soma do triplo de " + inteiro1 + " com " + real3 + " = " + calculo2);
        System.out.printf("%.1f elevado ao cubo = %.2f", real3, calculo3);
        sc.close();
    }
}
