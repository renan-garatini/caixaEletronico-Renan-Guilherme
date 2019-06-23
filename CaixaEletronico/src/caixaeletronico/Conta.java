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
public class Conta {
    private String usuario;
    private String senha;
    private Float saldo;

    public String novaConta(String usuario, String senha ) {
        this.usuario = usuario;
        this.senha = senha;
        this.saldo = Float.valueOf("10");
        
        return "Conta criada com sucesso!";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    
    public String deposito(Float valor)
    {
        setSaldo(getSaldo()+valor);
        
        return "Realizado o deposito de: R$:"+valor;
    }
    
    public String sacar(Float valor)
    {
        Float saldoFinal = getSaldo() - valor;
        
        if(saldoFinal < 0 || getSaldo() == 0)
        {
            return "Saldo insuficiente";
        }
        else
        {
            setSaldo(saldoFinal);
            return "Saque realizado! Seu novo saldo é: R$"+this.saldo;
        }
    }
}
