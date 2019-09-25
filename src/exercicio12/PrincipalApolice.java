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
public class PrincipalApolice {

    public static void main(String[] args) {
        Apolice apolice = new Apolice("João da Silva", 27, 900.00);
        System.out.println(apolice.imprimir() + "\n");
        apolice.calcularPremio();
        System.out.println(apolice.imprimir() + "\n");
        apolice.oferecerDesconto("Itajai");
        System.out.println(apolice.imprimir() + "\n");
    }
}
