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
public class Matriz {

    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        
        matriz[0][0] = 3;
        matriz[0][1] = 5;
        matriz[1][0] = 7;
        matriz[1][1] = 9;
        matriz[0][2] = 1;
        matriz[1][2] = 1;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
