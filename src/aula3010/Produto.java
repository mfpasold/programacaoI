/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3010;

/**
 *
 * @author mfpasold
 */
class Produto {
    
    private String descricao;
    private double preco;

    public Produto() {
    }

    public Produto(String descricao, double preco) {
        setDescricao(descricao);
        setPreco(preco);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", preco=" + preco + '}';
    }
    
    
}
