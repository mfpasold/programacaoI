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
public class AlunoPosGraduacao extends Aluno{
 
    private int posComp;

    public AlunoPosGraduacao(int posComp, String nome, String curso) {
        super(nome, curso);
        setPosComp(posComp);
    }

    public int getPosComp() {
        return posComp;
    }

    public void setPosComp(int posComp) {
        this.posComp = posComp;
    }
    
    public String exibirDados() {
        return "Nome: " + getNome() + "\nCurso: " + getCurso() + "\nPosComp: " + getPosComp();
    }
    
    
}
