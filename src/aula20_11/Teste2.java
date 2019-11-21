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
public class Teste2 {

    public static void main(String[] args) {
        ProfDE profDE = new ProfDE("Maria", 20000);
        ProfHorista profHorista = new ProfHorista(20, 154, "Pedro");
        
        Professor prof1 = new ProfDE("Judas", 6666);
        //System.out.println(prof1);
        
        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(prof1);
        professores.add(profHorista);
        professores.add(profDE);
        
        for(Professor p : professores) {
            System.out.println(p.getSalario());
        }
        
        
        
        
    }
}
