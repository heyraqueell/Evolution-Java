//Faça um Programa que converta metros para centímetros.
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class ConverterMetros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                -------------------------------------
                CONVERSOR DE METROS PARA CENTÍMETROS
                --------------------------------------""");

        System.out.print("Entre com os metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100.00;

        System.out.print(metros + " metros = " + centimetros + " CENTÍMETROS");
        sc.close();
    }
}
