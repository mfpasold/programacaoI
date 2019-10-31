/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3010;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Pedido {
    
    private int nrPedido;
    private Cliente cliente;
    private ArrayList<Itens> itens;

    public Pedido() {
    }

    public Pedido(int nrPedido, Cliente cliente) {
        setNrPedido(nrPedido);
        setCliente(cliente);
        setItens(new ArrayList<>());
        
    }

    public int getNrPedido() {
        return nrPedido;
    }

    public void setNrPedido(int nrPedido) {
        this.nrPedido = nrPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Itens> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Itens> itens) {
        this.itens = itens;
    }
    
    public void adicionarItem(Itens item) {
        getItens().add(item);
    }
    
    public double calcularTotalPedido() {
        double total = 0;
        for(Itens item : getItens()) {
            total += item.calcularItem();
        }
        
        return total;
    }

    @Override
    public String toString() {
        String str = "Número do Pedido: " + getNrPedido() +
                        "\nCliente: " + getCliente().getNome() + "\n";
        for(Itens item : getItens()) {
            str += item.toString() + "\n";
        }
        
        str += "\n\nTotal: " + calcularTotalPedido();
        
        return str;
    }
    
    
    
}
