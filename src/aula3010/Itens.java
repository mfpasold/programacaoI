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
class Itens {
    
    private Produto produto;
    private int quantidade;

    public Itens(Produto produto, int quantidade) {
        setQuantidade(quantidade);
        setProduto(produto);
    }

    public Itens() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double calcularItem() {
        return getProduto().getPreco() * getQuantidade();
    }

    @Override
    public String toString() {
        return "Produto = " + getProduto() + "\nQuantidade = " + getQuantidade() + "\nTotal = " + calcularItem();
    }
    
    
    
}
