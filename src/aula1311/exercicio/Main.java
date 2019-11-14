/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1311.exercicio;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Main {
    
    public static void main(String[] args) {
        AlunoGraduacao umAluno = new AlunoGraduacao("Joao", "SIS", 2);
        System.out.println(umAluno.exibirDados());
        
        AlunoPosGraduacao umAlunoPos = new AlunoPosGraduacao(40, "Ronaldo", "Data Science");
        System.out.println(umAlunoPos.exibirDados());
        
        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(umAluno);
        alunos.add(umAlunoPos);
        
        for(Aluno aluno : alunos) {
            if(aluno instanceof AlunoGraduacao) {
                AlunoGraduacao graduacao = (AlunoGraduacao) aluno;
                System.out.println(graduacao.exibirDados());
            }else {
                System.out.println(((AlunoPosGraduacao)aluno).exibirDados());
            }
        }
    }
}
