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
public class Aluno {
    
    
    private String nome, curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String exibirDados() {
        return "";
    }
}
