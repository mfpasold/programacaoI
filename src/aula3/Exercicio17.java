/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Arrays;

/**
 *
 * @author mfpasold
 */
public class Exercicio17 {
    
    public static void main(String[] args) {
        int novoi = 0;
        int pos = 0;
        int c[] = {1,1,0,1,0,-1,0,0,2};
        int m[] = new int [c.length];
        int p[] = {2,-10,1,0,18,37,17,19,5};
        char letras[] = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q','r','s','t','u','v','x','z'};
        
        for(int i = 0; i < p.length; i++) {
            m[i] = p[i] - c[i];
        }
        System.out.println(Arrays.toString(m));
        
        for(int i = 0; i < p.length; i++) {
            if(p[i] > 23) {
                System.out.print(letras[p[i] % 23]);
            }else if(p[i] < 0) {
                novoi = p[i];
                while(novoi < 0) {
                    novoi += 24;
                }
                System.out.print(letras[novoi]);
                novoi = 0;
            }else {
                System.out.print(letras[p[i]]);
            }
        }
        System.out.println("");
    }
}
