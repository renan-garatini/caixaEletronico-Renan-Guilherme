/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;


import caixaeletronico.DAORMIContaInterface;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import caixaeletronico.Conta;


/**
 *
 * @author felip
 */
public class DAORMIClient implements DAORMIContaInterface {

    private static final long serialVersionUID=1L;
    
    List<Conta> contas=new ArrayList<>();

    
    protected DAORMIClient(String mensagem) throws RemoteException{
        super();
    }

    @Override
    public void sacar(int id, String nome) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depositar(int id, String nome) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




        
}

