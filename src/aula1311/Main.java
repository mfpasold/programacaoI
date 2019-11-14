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
public class Main {
 
    public static void main(String[] args) {
        Publicacao umaPublicacao = new Publicacao();
        umaPublicacao.setNome("Show");
        umaPublicacao.setEditora("Abril");
        //System.out.println(umaPublicacao);
        
        LivroW umLivro = new LivroW();
        umLivro.setNome("As aventuras do Chaves");
        umLivro.setEditora("Saraiva");
        umLivro.setISBN("123-456");
        System.out.println(umLivro);
    }
}
