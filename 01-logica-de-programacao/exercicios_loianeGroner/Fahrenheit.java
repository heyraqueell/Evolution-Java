/*
Faça um Programa que peça a temperatura em graus Fahrenheit,
transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5 * (fahrenheit -32.0) / 9.0);
        System.out.print("Temperatura em Celsius: " + celsius);
        sc.close();
    }
}
