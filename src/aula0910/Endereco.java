/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0910;

/**
 *
 * @author mfpasold
 */
public class Endereco {

    private String rua;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String rua, String cidade) {
        setRua(rua);
        setCidade(cidade);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
