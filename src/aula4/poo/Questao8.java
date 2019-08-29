/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.poo;

/**
 *
 * @author mfpasold
 */
public class Questao8 {

    public static void main(String[] args) {

        int matriz[][] = {{3, 5, 7, 2}, {21, 34, 56, 87}, {67, 78, 12, 35}, {9, 34, 57, 86}};
        int somaDiagonal = 0;
        int pares[] = new int[20];
        int count = 0;
        int menorPar = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    somaDiagonal += matriz[i][j];

                }
                /*
                 if(j == ((matriz.length - 1) - i)) {
                 somaDiagonal += matriz[i][j];
                 }
                 */
                if (matriz[i][j] % 2 == 0) {
                    if(matriz[i][j] < menorPar) {
                        menorPar = matriz[i][j];
                    }
                    pares[count] = matriz[i][j];
                    count++;
                }
            }
        }

        System.out.println("total da diagonal principal: " + somaDiagonal);
        System.out.println("Menor par: " + menorPar);
    }
}
