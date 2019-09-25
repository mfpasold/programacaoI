/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author mfpasold
 */
public class Agenda {

    public static void main(String[] args) {
        //criando agenda de 30 dias e 24 horas
        Compromisso agenda[][] = new Compromisso[30][23];
        
        int dia = 3;
        int hora = 2;
        agenda[dia - 1][hora] = new Compromisso("Mandar Email", "Minha casa");
        
        for (int i  = 0; i < agenda[0].length; i++) {
            if(agenda[dia - 1][i] != null) {
                System.out.println("Compromisso do dia " + dia + " as " + hora + " horas");
                System.out.println(agenda[dia - 1][i].toString());
            }
        }
    }
}
