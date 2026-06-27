/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */
package exercicios_loianeGroner.vetores;

public class VetoresIguais {
    public static void main(String[] args) {

        //Maneira segura e boas práticas para criar vetores iguais, mas independentes.
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = new int[vetorA.length];

        //Copiando os valores de maneira segura
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i];
        }

        //Imprimir resultados separados - Boas práticas!

        System.out.println("------- VETOR A -------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor A posição "+ (i + 1) + " = " + vetorA[i]);
        }

        System.out.println("------- VETOR B -------");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor B posição "+ (i + 1) + " = " + vetorB[i]);
        }

    }
}
