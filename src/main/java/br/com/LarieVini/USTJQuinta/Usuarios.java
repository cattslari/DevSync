/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.LarieVini.USTJQuinta;

/**
 *
 * @author vinin
 */
public class Usuarios {
    private int codigo;
    private String login;
    private String senha;
    
    //construtor padrão
    Usuarios(){}
    
    Usuarios(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
