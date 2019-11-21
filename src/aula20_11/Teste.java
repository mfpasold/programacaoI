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
public class Teste {
    
    public static void main(String[] args) {
        ProfDE profDE = new ProfDE("Maria", 20000.00);
        //System.out.println(profDE);
        
        ProfHorista profHorista = new ProfHorista(20, 154, "Pedro");
        //System.out.println(profHorista);
        
        ArrayList professores = new ArrayList();
        professores.add(profDE);
        professores.add(profHorista);
        
        for (int i = 0; i < professores.size(); i++) {
            if(professores.get(i) instanceof ProfDE) {
                ProfDE prof = (ProfDE) professores.get(i);
                System.out.println(prof.getSalario());
            }else {
                ProfHorista prof = (ProfHorista) professores.get(i);
                System.out.println(prof.getSalario());
            }
        }
    }
}
