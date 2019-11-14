/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1311;

/**
 *
 * @author mfpasold
 */
public class LivroW extends Livro{

    public LivroW () {
        super(null, null, null);
    }
    public LivroW(String ISBN, String nome, String editora) {
        super(ISBN, nome, editora);
    }
    
    @Override
    public String toString() {
        return "LivroW (" + super.toString() + ")";
    }
    
    
}
