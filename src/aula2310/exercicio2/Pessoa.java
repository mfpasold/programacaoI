/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2310.exercicio2;

/**
 *
 * @author mfpasold
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*@Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + '}';
    }*/
    
    public String exibirDados() {
        return "nome : " + nome + "\nCPF: " + cpf;
    }
}
