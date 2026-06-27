/*
Criar um vetor A com 10 elementos inteiros.
Descreva a quantidade de elementos armazenados neste vetor que são pares.
Escreva a soma de todos os elementos armazenados neste vetor.
 */
package exercicios_loianeGroner.vetores;

public class VerificarPares {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int par = 0;
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                par += 1;
            }
            //SOMA DE TODOS OS ELEMENTOS
            soma += vetorA[i];
        }

        System.out.println("Quantidades de elementos pares: " + par);
        System.out.println("Total da soma de todos os elementos: " + soma);
    }
}
