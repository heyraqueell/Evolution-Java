/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior ou igual que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */
package exercicios_loianeGroner;

import java.util.Locale;
import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                -----------------------------
                          CADASTRO 
                -----------------------------""");

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do { //nome
            System.out.print("Digite seu primeiro nome: ");
            nome = sc.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("NOME INVÁLIDO (Nome deve haver mais que 3 letras). TENTE NOVAMENTE");
            }
        }  while (!infoValida);

        infoValida = false;

        do { //idade
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            if (idade > 0 && idade < 150) {
                infoValida = true;
            } else {
                System.out.println("IDADE INVÁLIDA. TENTE NOVAMENTE");
            }
        }  while (!infoValida);

        infoValida = false;

        do { //Salário
            System.out.print("Digite seu Salário : R$");
            salario = sc.nextDouble();

            if (salario > 0.00) {
                infoValida = true;
            } else {
                System.out.println("SALÁRIO INVÁLIDO. TENTE NOVAMENTE");
            }
        }  while (!infoValida);

        infoValida = false;

        do { //Sexo
            System.out.print("Sexo [F/M]: ");
            sexo = sc.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("SEXO INVÁLIDO. TENTE NOVAMENTE");
            }
        }  while (!infoValida);

        infoValida = false;

        do { //Estado civil
            System.out.print("Estado civil [S/C/D/V]: ");
            estadoCivil = sc.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("D") || estadoCivil.equalsIgnoreCase("V")) {
                infoValida = true;
            } else {
                System.out.println("ESTADO CIVIL INVÁLIDO. TENTE NOVAMENTE");
            }
        }  while (!infoValida);

        System.out.println("CADASTRO FINALIZADO!");

        sc.close();
    }
}
