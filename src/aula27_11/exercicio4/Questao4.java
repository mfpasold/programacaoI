/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11.exercicio4;

/**
 *
 * @author mfpasold
 */
public class Questao4 {

    public static void main(String[] args) {
        BoteSalvaVidas bote1 = new BoteSalvaVidas(false, 5452, 499);
        Navio navio = new Navio("Redenção XIII", 768, 1490);
        navio.agregarBotes(new BoteSalvaVidas(false, 5452, 498));
        navio.agregarBotes(new BoteSalvaVidas(true, 2346, 328));
        navio.agregarBotes(new BoteSalvaVidas(true, 438, 157));
        
        System.out.println(navio.mostrar());
    }
}
