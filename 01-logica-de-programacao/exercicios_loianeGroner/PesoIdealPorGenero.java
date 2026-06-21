/*
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdealPorGenero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pesoIdeal = 0.0;
        double pesoAtual = 0.0;

        System.out.println("""
                --------------------------------------
                  CALCULADORA PESO IDEAL (POR GÊNERO)
                --------------------------------------""");

        System.out.print("Por favor, digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu gênero [M/F]: ");
        char genero = sc.next().charAt(0);

        if (genero == 'M') {
            pesoIdeal = (72.7 * altura) - 58.0;
            System.out.printf("Seu peso ideal: %.1fKg%n", pesoIdeal);
        } else  if (genero == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal: %.1fKg%n", pesoIdeal);
        } else {
            System.out.println("DIGITE UM VALOR VÁLIDO.");
        }

        System.out.println();
        System.out.print("Digite seu peso atual: ");
        pesoAtual = sc.nextDouble();

        if (pesoAtual > pesoIdeal) {
            System.out.println("Você está ACIMA do peso ideal.");
        } else if ( pesoAtual < pesoIdeal) {
            System.out.println("Você está ABAIXO do peso ideal.");
        } else {
            System.out.println("Você está com o peso IDEAL");
        }
        sc.close();
    }
}
