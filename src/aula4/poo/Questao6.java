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
public class Questao6 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[2][4];
        
        matriz[0][0] = 11;
        matriz[0][1] = 15;
        matriz[0][2] = 9;
        matriz[0][3] = 5;
        
        matriz[1][0] = 3;
        matriz[1][1] = 8;
        matriz[1][2] = 4;
        matriz[1][3] = 13;
        
        int total = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        
        System.out.println(total);
        
        total = 0;
        int[] somaLinhas = new int[matriz.length];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
            System.out.println("O total da linha " + (i + 1) + " é " + somaLinhas[i]);
        }
    }
}
