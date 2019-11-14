/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1311.exercicio;

/**
 *
 * @author mfpasold
 */
public class AlunoGraduacao extends Aluno{
    
    private int fase;

    public AlunoGraduacao(String nome, String curso, int fase) {
        super(nome, curso);
        setFase(fase);
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String exibirDados() {
        return "Nome: " + getNome() + "\nCurso: " + getCurso() + "\nFase: " + getFase();
    }
    
    
    
    
}
