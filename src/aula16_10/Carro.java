/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16_10;

/**
 *
 * @author mfpasold
 */
public class Carro {

    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private int localizacao;

    public Carro() {
    }

    public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizacao) {
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        setAno(ano);
        setPreco(preco);
        setLocalizacao(localizacao);
    }

    public Carro(String marca, int ano, double preco, int localizacao) {
        setMarca(marca);
        setAno(ano);
        setPreco(preco);
        setLocalizacao(localizacao);
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
    
    public String imprimir() {
        return "Modelo: " + getModelo() + 
                "\nMarca: " + getMarca() + 
                "\nPlaca: " + getPlaca() + 
                "\nCor: " + getCor() + 
                "\nAno: " + getAno()+ 
                "\nPreço: " + getPreco() + 
                "\nLocalização: " + getLocalizacao();
    }
    
}
