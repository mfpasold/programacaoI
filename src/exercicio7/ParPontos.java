/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author mfpasold
 */
public class ParPontos {

    public static void main(String[] args) {
        Ponto vetorPontos[] = new Ponto[4];
        
        vetorPontos[0] = new Ponto(1.0,1.0);
        vetorPontos[1] = new Ponto(3.0,1.0);
        vetorPontos[2] = new Ponto(2.0,4.0);
        vetorPontos[3] = new Ponto(6.0, 4.0);
        
        for(int i = 0; i < vetorPontos.length; i++) {
            System.out.println(vetorPontos[i].getX() + ", " + vetorPontos[i].getY());
        }
    }
}
