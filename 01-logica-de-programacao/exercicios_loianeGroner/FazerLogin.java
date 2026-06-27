/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */
package exercicios_loianeGroner;

import java.util.Scanner;

public class FazerLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                -------------------------
                         SIGN UP
                -------------------------""");

        String user;
        String password;
        boolean valid = false;

        do {
            System.out.print("User: ");
            user = sc.next();

            System.out.print("Password: ");
            password = sc.next();

            if (password.equalsIgnoreCase(user)) {
                System.out.println("NOT VALID");
                System.out.println("PLEASE ENTER WITH A VALID PASSWORD");
            } else {
                valid = true;
                System.out.println("WELCOME @" + user);
            }
        } while (!valid);

        sc.close();
    }
}
