/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author felip
 */
public interface DAORMIContaInterface extends Remote {    
    
    void sacar(int id, String nome) throws RemoteException;
    void depositar(int id, String nome) throws RemoteException;
}
