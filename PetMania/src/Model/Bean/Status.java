/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

/**
 *
 * @author Aline
 */
public class Status {
    
    private int tvendas, tservicos;
    private double investimento, lucro;

    public int getTvendas() {
        return tvendas;
    }

    public void setTvendas(int tvendas) {
        this.tvendas = tvendas;
    }

    public int getTservicos() {
        return tservicos;
    }

    public void setTservicos(int tservicos) {
        this.tservicos = tservicos;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    
    
    
}
