/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

/**
 *
 * @author mfpasold
 */
public class Apolice {

    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice() {
    }

    public Apolice(String nome, int idade, double valorPremio) {
        this.nome = nome;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
    
    public String imprimir() {
        return "Imprimindo os dados inicializados: \n" + "Nome: " + nome + "\nIdade: " + idade + "\nValor Premio: " + valorPremio + '.';
    }
    
    public void calcularPremio() {
        if(idade >= 18 && idade <= 25) {
            this.valorPremio += (this.valorPremio * 20 ) / 100;
        }else if(idade > 25 && idade <= 36) {
            this.valorPremio += (this.valorPremio * 15 ) / 100;
        }else if(idade > 36) {
            this.valorPremio += (this.valorPremio * 10 ) / 100;
        }else {
            System.out.println("Sem prêmio para idade");
        }
    }
    
    public void oferecerDesconto(String cidade) {
        switch(cidade.toUpperCase()) {
            case "ILHOTA":
                this.valorPremio -= (valorPremio * 0.05);
                break;
            case "BLUMENAU":
                this.valorPremio -= (valorPremio * 0.03);
                break;
            case "ITAJAI":
                this.valorPremio -= (valorPremio * 0.01);
                break;
            default:
                
        }
    }
}
