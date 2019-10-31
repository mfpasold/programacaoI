/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16_10;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        carros.add(new Carro("VW", 2015, 2, 20000));
        carros.add(new Carro("Fiat", 2015, 2, 25000));
        carros.add(new Carro("GM", 2017, 1, 25000));
        
        for(int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).imprimir() + "\n" + "********************");
        }
    }
    
    public ArrayList<Carro> listarMaiorPreco(ArrayList<Carro> carros) {
        ArrayList<Carro> retorno = new ArrayList<>();
        double maior = Double.MIN_VALUE;
        
        for(int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getPreco() > maior) {
                maior = carros.get(i).getPreco();
            }
        }
        
        for(int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getPreco() == maior) {
                retorno.add(carros.get(i));
            }
        }
        
        return retorno;
    }
    
    
}
 