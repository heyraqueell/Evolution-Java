/*
Fazer um programa para ler um número inteiro e os dados (nome e preço) de N produtos.
Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */
package vetores01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int quantity = sc.nextInt();

        Product[] vect = new Product[quantity]; //Vetor criado e instânciado a classe Product

        for (int i = 0; i < vect.length; i++) { //vect.comprimento
            sc.nextLine(); //Buffer
            System.out.print("PRODUCT: ");
            String name = sc.nextLine();

            System.out.print("VALUE: ");
            double price = sc.nextDouble();
            System.out.println();
            vect[i] = new Product(name, price); //Instanciando as informações -> Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) { //Laço for criado para acumular valores
            sum += vect[i].getPrice();
        }
        double average = sum / vect.length; //Média

        System.out.printf("AVERAGE PRICE: $%.2f", average);

        sc.close();
    }
}
