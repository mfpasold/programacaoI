/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_11;

/**
 *
 * @author mfpasold
 */
public class ProfHorista extends Professor{

    private int qtHoras;
    private double vlHora;

    public ProfHorista(int qtHoras, double vlHora, String nome) {
        super(nome);
        setQtHoras(qtHoras);
        setVlHora(vlHora);
    }

    public int getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(int qtHoras) {
        this.qtHoras = qtHoras;
    }

    public double getVlHora() {
        return vlHora;
    }

    public void setVlHora(double vlHora) {
        this.vlHora = vlHora;
    }
    
    public double getSalario() {
        return getQtHoras() * getVlHora();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQt de horas: " + getQtHoras() + 
                "\nValor por hora: " + getVlHora() +
                "\nSalario: " + getSalario();
    }
    
    
}
