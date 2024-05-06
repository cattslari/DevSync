/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.LarieVini.USTJQuinta;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vinin
 */
public class ConnectionFactory {
    String host = "";
    String port = "";
    String user = "";
    String password = "";
    String database = "";
   
    //4 partes: tipo de retorno, nome, lista de parâmetros e corpo
    Connection conectar() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        var stringConexao = String.format("jdbc:mysql://dbdevsync-vinizinhonascimento-38b6.b.aivencloud.com:19793/defaultdb?zeroDateTimeBehavior=CONVERT_TO_NULL",
               host, port, database
        );
        return DriverManager.getConnection(stringConexao, user, password);
    }
}
