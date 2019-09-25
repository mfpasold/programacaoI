/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author mfpasold
 */
public class Compromisso {

    private String descricao;
    private String local;
    
    public Compromisso() {
    }

    public Compromisso(String descricao, String local) {
        this.descricao = descricao;
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao + "\nlocal: " + local;
    }
}
