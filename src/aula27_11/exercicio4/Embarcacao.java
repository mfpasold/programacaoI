/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11.exercicio4;

/**
 *
 * @author mfpasold
 */
public abstract class Embarcacao {
    
    protected int registroCapitania;
    protected int qtdPessoas;

    public Embarcacao(int registroCapitania, int qtdPessoas) {
        this.registroCapitania = registroCapitania;
        this.qtdPessoas = qtdPessoas;
    }

    
    public int getRegistroCapitania() {
        return registroCapitania;
    }

    public void setRegistroCapitania(int registroCapitania) {
        this.registroCapitania = registroCapitania;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    public abstract String mostrar();
    
}
