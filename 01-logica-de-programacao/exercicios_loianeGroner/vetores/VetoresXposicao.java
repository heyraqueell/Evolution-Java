/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice)
 */
package exercicios_loianeGroner.vetores;

public class VetoresXposicao {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("--------- VETOR A ---------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor na posição " + i + " = " + vetorA[i]);
        }

        System.out.println("--------- VETOR B ---------");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor na posição " + i + " = " + vetorB[i]);
        }
    }
}
