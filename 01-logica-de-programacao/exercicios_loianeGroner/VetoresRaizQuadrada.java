/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A.
 */
package exercicios_loianeGroner;

import static java.lang.Math.sqrt;

public class VetoresRaizQuadrada {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sqrt(vetorA[i]);
        }

        System.out.println("--------- VETOR A ---------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor na posição " + (i + 1) + " = " + vetorA[i]);
        }

        System.out.println("--------- VETOR B ---------");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Vetor na posição " + (i + 1) + " = %.2f%n", vetorB[i]);
        }
    }
}
