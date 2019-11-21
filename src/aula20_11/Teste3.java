/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_11;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Teste3 {
    
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Vaca());
        animais.add(new Gato());
        animais.add(new Cao());
        
        for(Animal a: animais) {
            if(a instanceof Gato) {
                ((Gato)a).som();
            }else if(a instanceof Cao) {
                ((Cao)a).som();
            }else if(a instanceof Vaca) {
                ((Vaca)a).som();
            }
        }
    }
}
