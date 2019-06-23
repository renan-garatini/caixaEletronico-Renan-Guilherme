/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author Aluno
 */
public class Terminal {
    private Float saldoDisponivel;

    public Float getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Float saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public void debitaSaldo(Float valor)
    {
        setSaldoDisponivel(getSaldoDisponivel()-valor);
    }
    
    
}
