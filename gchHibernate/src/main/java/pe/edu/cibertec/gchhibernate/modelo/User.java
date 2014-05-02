/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchhibernate.modelo;

import java.io.Serializable;

/**
 *
 * author Lucas
 * Representa al usuario de la aplicacion
 */


public class User implements Serializable{

    private String user;
    private String pass;  
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }    
}
