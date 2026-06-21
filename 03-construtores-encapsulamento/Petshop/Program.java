package Petshop;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                -------------------------------------
                BEM-VINDO AO PETSHOP WONDEFUL LIFE
                -------------------------------------
                """);
        System.out.print("Quantos cachorros você irá cadastrar? ");
        int qnt = sc.nextInt();
        sc.nextLine();

        Pet[] pet = new Pet[qnt];

        for (int i = 0; i < pet.length; i++) {
            System.out.print("Qual o nome do seu " + (i + 1) + "º doguinho? ");
            String nome = sc.nextLine();

            System.out.print("Qual a raça do(a) " + nome + "? ");
            String raca = sc.nextLine();

            System.out.print("Qual grupo ele se encaixa? ");
            String grupo = sc.nextLine();

            System.out.print("Qual o porte [PEQUENO] [MÉDIO] [GRANDE]? ");
            String porte = sc.next();

            System.out.print("Altura do doguinho: ");
            double altura = sc.nextDouble();

            System.out.print("Peso [Kg]: ");
            double peso = sc.nextDouble();

            sc.nextLine();

            System.out.print("Temperamento do cão: ");
            String temperamento = sc.nextLine();
            System.out.println();

            pet[i] = new Pet(nome, raca, grupo, porte, altura, peso, temperamento);
        }

        System.out.println("""
                ---------------------------------------
                          CANTINHO DO CADASTRO
                ---------------------------------------""");

        for (int i = 0; i < pet.length; i++) {
            System.out.println(pet[i].toString());
            System.out.println("---------------------------------------");
        }

        sc.close();
    }
}
