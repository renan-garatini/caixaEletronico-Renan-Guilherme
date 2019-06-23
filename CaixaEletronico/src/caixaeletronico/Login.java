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
public class Login {
    private String user;
    private String senha;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Login(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    
    public int logar()
    {
        //procura no banco
        //se tiver logado retorna 1
        //se nao retorna 0
        return 1;
    }
}

