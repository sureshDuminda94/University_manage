/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author suresh
 */
public class Account_transaction {
    
       private String password;
   private String user_name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Account_transaction() {
    }

    public Account_transaction(String password, String user_name) {
        this.password = password;
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Account_transaction{" + "password=" + password + ", user_name=" + user_name + '}';
    }
    
}
