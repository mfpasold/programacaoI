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
public class Livro extends Publicacao{
    
    private String ISBN;

    public Livro(String ISBN, String nome, String editora) {
        super(nome, editora);
        this.ISBN = ISBN;
    }

    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

 
    public String toString() {
        return super.toString() + ", ISBN: " + ISBN ;
    }
    
}
