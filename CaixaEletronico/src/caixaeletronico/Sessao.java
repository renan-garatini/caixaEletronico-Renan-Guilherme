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
public class Sessao {
    Terminal terminal = new Terminal();
    Conta conta = new Conta();

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Sessao(Terminal terminal, Conta conta) {
        this.terminal = terminal;
        this.conta = conta;
    }
    
    
}
