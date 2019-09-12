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
public class Questao7 {
    
    public static Double calcularDistancia(Ponto um, Ponto dois) {
        
        return Math.sqrt(Math.pow(um.getX() - dois.getX(), 2) + Math.pow(um.getY() - dois.getY(), 2));
    }
  
    public static void main(String[] args) {
        //entrada de valores
        double x = 1.0;
        double y = 1.0;
        
        //criando objeto ponto
        Ponto ponto = new Ponto();
        //populando o objeto Ponto
        ponto.setX(x);
        ponto.setY(y);
        
        System.out.println(ponto.imprimir());
        //imprimir
        System.out.println("X : " + ponto.getX() + ", Y: " + ponto.getY());
        
        Ponto segundo = new Ponto(1.0,3.0);
        
        //System.out.println(calcularDistancia(ponto, segundo));
        
        System.out.println("Distância: " + ponto.calcularDistancia(segundo));
        
    }
}
