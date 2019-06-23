/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Renan
 */
public class ContaDAO {
    Connection connection = null;
 
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if(connection == null)
                connection = DriverManager.getConnection("jdbc:mysql://localhost/caixa?user=root&password=");
 
        } catch (ClassNotFoundException e) {
 
            e.printStackTrace();
             
        } catch (SQLException e) {
             
            e.printStackTrace();
             
        }
        return connection;
    }

    public ResultSet sacar(Float val,Conta conta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE conta SET saldo = (SELECT saldo FROM conta WHERE id = ?)- ? WHERE id = ?");
            preparedStatement.setString(1,  conta.getUsuario());
            preparedStatement.setString(2,  val.toString());
            preparedStatement.setString(3,  conta.getUsuario());
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.close();
            return resultSet;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
         
    }
 
         
    public void closeConnection(){
        try {
              if (connection != null) {
                  connection.close();
              }
            } catch (Exception e) { 
                //do nothing
            }
    }
}
