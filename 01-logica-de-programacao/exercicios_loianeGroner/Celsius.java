/*
Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = ((celsius * 9) / 5 + 32.0);
        System.out.print("Temperatura em Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
