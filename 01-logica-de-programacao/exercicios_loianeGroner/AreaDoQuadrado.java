/*
Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho do lado de um quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        double dobroQuadrado = area * 2;

        System.out.println("A área do quadrado é de " + area + "cm");
        System.out.println("O dobro da área é de " + dobroQuadrado + "cm");

        sc.close();
    }
}
