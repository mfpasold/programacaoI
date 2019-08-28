/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author mfpasold
 */
public class Exercicio17 {
    
    public static void main(String[] args) {
        
        String nr1 = "123";
        String nr2 = "2312";
        
        int[] seq1 = new int[nr1.length()];
        int[] seq2 = new int[nr2.length()];
        
        String[] split = nr1.split("");
        String[] split2 = nr2.split("");
        
        for(int i = 0; i < split.length; i++) {
            seq1[i] = Integer.parseInt(split[i]);
        }
        
        for(int i = 0; i < split2.length; i++) {
            seq2[i] = Integer.parseInt(split2[i]);
        }
        
        int soma = (seq1[1] + seq2[1]) % 10; 
    }
    
    public static String nvl(String value, String alternateValue) {
    if (value == null)
        return alternateValue;

    return value;
    }
}
