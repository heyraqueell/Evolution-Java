/*
Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                -----------------------------------
                       DESCUBRA SEU PESO IDEAL
                -----------------------------------""");

        System.out.print("Entre com sua ALTURA: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é: %.1fKg", pesoIdeal);

        sc.close();
    }
}
