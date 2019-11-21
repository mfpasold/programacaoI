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
public class ProfDE extends Professor{

    private double salario;
    
    public ProfDE(String nome, double salario) {
        super(nome);
        setSalario(salario);
        System.out.println("Construtor ProfDE");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ProfDE{" + "salario=" + salario + '}';
    }
    
}
