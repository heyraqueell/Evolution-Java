/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2.
 */
package exercicios_loianeGroner;

public class VetoresIguaisDuplicados {
    public static void main(String[] args) {
        int[] vetorA = {2, 4, 6 , 8, 10, 12, 14, 16};
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("------- VETOR A -------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor na posição " + (i + 1) + " = " + vetorA[i]);
        }

        System.out.println("------- VETOR B -------");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor na posição " + (i + 1) + " = " + vetorB[i]);
        }
    }
}
