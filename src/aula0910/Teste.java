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
public class Teste {

    public static void main(String[] args) {
        Endereco ed1 = new Endereco("Rua XV novembro", "Blumenau");
        Pessoa p1 = new Pessoa("Joao", 21, ed1);
        
        System.out.println(p1.toString());
    }
}
