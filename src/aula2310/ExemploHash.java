/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2310;

import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author mfpasold
 */
public class ExemploHash {
    
    public static void main(String[] args) {
        HashMap<String, String> pessoas = new HashMap<String, String>();
        
        pessoas.put("123", "Joao");
        pessoas.put("456", "Maria");
        pessoas.put("789", "Pedro");
        pessoas.put("035", "Marta");
        pessoas.put("157", "Mateus");
        pessoas.put("359", "Madalena");
        pessoas.put("035", "Abigail");
        pessoas.put("666", "Apocalipse");
        
        //System.out.println(pessoas.get("359"));
        //JOptionPane.showMessageDialog(null, pessoas.get("666"));
        
        Iterator itPessoas = pessoas.values().iterator();
        
        while(itPessoas.hasNext()) {
            System.out.println(itPessoas.next());
        }
    }
}
