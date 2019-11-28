/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11.exercicio4;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Navio extends Embarcacao{

    protected String nome;
    protected ArrayList<BoteSalvaVidas> botes;
    
    public Navio(String nome, int registroCapitania, int qtdPessoas) {
        super(registroCapitania, qtdPessoas);
        setNome(nome);
        botes = new ArrayList<BoteSalvaVidas>();
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void agregarBotes(BoteSalvaVidas bote) {
        botes.add(bote);
    }
    
    public boolean verificarPessoasBotes() {
        int totalPessoasBotes = 0;
        for (BoteSalvaVidas bote : botes) {
            totalPessoasBotes += bote.getQtdPessoas();
        }
        return totalPessoasBotes >= getQtdPessoas();
    }
    public String mostrar() {
        return "Reg. Capitania: " + getRegistroCapitania() + "\n" +
                "Qtd pessoas: " + getQtdPessoas() + "\n" +
                "Nome" + getNome() + "\n" +
                "Botes: " + "\n" +
                getBotes() + "\n" +
                (verificarPessoasBotes() ? "Navio atende normas de segurança" : "Navio não atende normas de segurança");
    }
    
    public String getBotes() {
        String returno = "";
        for(int i = 0; i < botes.size(); i++) {
            returno += "Bote " + (i+1) + ": " + botes.get(i).mostrar();
        }
        return returno;
    }
    
    
}
