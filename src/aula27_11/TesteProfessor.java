/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class TesteProfessor {
    
    public static void main(String[] args) {
        Professor umProfessor;
        ProfessorDE professorDE = new ProfessorDE();
        ProfHorista umProfHorista = new ProfHorista();
        
        ArrayList<Professor> professores = new ArrayList<Professor>();
        professores.add(professorDE);
        professores.add(umProfHorista);
        for(Professor p: professores) {
            System.out.println(p.getSalario());
        }
    }
}
