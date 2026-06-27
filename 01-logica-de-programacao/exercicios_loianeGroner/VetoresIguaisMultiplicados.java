/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A.
 */
package exercicios_loianeGroner;

public class VetoresIguaisMultiplicados {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] vetorB = new int[vetorA.length]; //CRIAR O VETOR B COM O MESMO TAMANHO DO VETOR A

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("--------- VETOR A ---------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor na posição " + (i + 1) + " = " + vetorA[i]);
        }

        System.out.println("--------- VETOR B ---------");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor na posição " + (i + 1) + " = " + vetorB[i]);
        }
    }
}
