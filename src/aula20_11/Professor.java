/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_11;

/**
 *
 * @author mfpasold
 */
public class Professor {
    
    private String nome;
    
    public Professor(String nome) {
        setNome(nome);
        System.out.println("Construtor Professor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }

    public double getSalario() {
        return 0.0;
    }
    
    
}
