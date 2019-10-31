/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2310.exercicio2;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author mfpasold
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao", "48522278931", 12);
        Pessoa pessoa2 = new Pessoa("Maria", "74185296310", 23);
        
        HashMap<String, Pessoa> pessoas = new HashMap();
        
        inserirPessoaHash(pessoa1, pessoas);
        inserirPessoaHash(pessoa2, pessoas);
        System.out.println(pessoas.size());
        
        imprimirPessoaHash(pessoas);
            
    }
    
    private static void inserirPessoaHash(Pessoa pessoa, HashMap<String, Pessoa> pessoas) {
        pessoas.put(pessoa.getCpf(), pessoa);
    }
    
    private static void imprimirPessoaHash(HashMap<String, Pessoa> pessoas) {
        for(String chave : pessoas.keySet()) {
            System.out.println(pessoas.get(chave).exibirDados());
        }
    }
}
