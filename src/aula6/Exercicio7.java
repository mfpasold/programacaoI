/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mfpasold
 */
public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1 = Integer.parseInt(teclado.nextLine());
        int y1 = Integer.parseInt(teclado.nextLine());
        
        int x2 = Integer.parseInt(teclado.nextLine());
        int y2 = Integer.parseInt(teclado.nextLine());
        
        double distancia = Math.pow((x1 + x2), 2) + Math.pow((y1 + y2), 2);
        
        System.out.println(distancia);
    }
}
