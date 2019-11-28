/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11.questai3;

/**
 *
 * @author mfpasold
 */
public class Avaliacao {
    private String aval, descricao;

    public Avaliacao(String aval, String descricao) {
        setAval(aval);
        setDescricao(descricao);
    }

    public String getAval() {
        return aval;
    }

    public void setAval(String aval) {
        this.aval = aval;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição mecanica: " + getDescricao() + " - " +
                "Aval: " + getAval();
    }
    
    
}
