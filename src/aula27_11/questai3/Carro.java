/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27_11.questai3;

import java.util.ArrayList;

/**
 *
 * @author mfpasold
 */
public class Carro {

    private String placa;
    private int ano, combustivel;
    private double potencia;
    ArrayList<Avaliacao> avaliacoes;

    public Carro(String placa, int ano, int combustivel, double potencia) {
        setPlaca(placa);
        setAno(ano);
        setCombustivel(combustivel);
        setPotencia(potencia);
        avaliacoes = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void agregarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }
    
    public double calcularRendimento() {
        return getCombustivel() == 1 ? 10 / (getPotencia() * 0.7) : 12 / (getPotencia() * 0.6);
    }
    
    @Override
    public String toString() {
        return "Carro placa: " + getPlaca() + " - Ano: " + getAno() + " - Combustivel: " + getCombustivel() +" - Potencia: " + getPotencia() +
                "\nAvaliaçoes: " + getAvaliacoes();
    }

    private String getAvaliacoes() {
        String retorno = "";
        for (Avaliacao avaliacoe : avaliacoes) {
                retorno += "    " + avaliacoe.toString();
        }
        
        return retorno;
    }
    
    
    
}
