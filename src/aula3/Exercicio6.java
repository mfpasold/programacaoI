/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author mfpasold
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int randomNum = random.nextInt(100) - 50;
        
        int pos = 0;
        int inicial[] = {-1,7,-23,-15,9,-6,30,47};
        int vetorFinal[] = new int[inicial.length];
        
        for(int i = 0; i < inicial.length; i++) {
            if(inicial[i] > 0) {
                vetorFinal[pos] = inicial[i];
                pos++;
            }
        }
        
        System.out.println(Arrays.toString(vetorFinal));
    }
}
