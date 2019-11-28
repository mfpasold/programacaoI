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
public class BoteSalvaVidas extends Embarcacao{

    protected boolean inflavl;

    public BoteSalvaVidas(boolean inflavl, int registroCapitania, int qtdPessoas) {
        super(registroCapitania, qtdPessoas);
        this.inflavl = inflavl;
    }

    
    public boolean isInflavl() {
        return inflavl;
    }

    public void setInflavl(boolean inflavl) {
        this.inflavl = inflavl;
    }
    
    
    @Override
    public String mostrar() {
        return "Reg. Capitania: " + getRegistroCapitania() + "\n" +
                "Qtd pessoas: " + getQtdPessoas() + "\n" +
                "Inflavel: " + (isInflavl() ? "Sim" : "Não");
    }
    
}
