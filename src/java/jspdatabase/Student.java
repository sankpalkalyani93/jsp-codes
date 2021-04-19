/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspdatabase;

/**
 *
 * @author kalyani
 */
public class Student {

    private String name, password, email, gender, country;
    private int id;
    
    public void setId(int id){
    
        this.id = id;
    }
    
    public int getId(){
    
        return id;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public String getName(){
    
        return name;
    }
    
    public void setPassword(String password){
    
        this.password = password;
    }
    
    public String getPassword(){
    
        return password;
    }
    
    public void setEmail(String email){
    
        this.email = email;
    }
    
    public String getEmail(){
    
        return email;
    }
    
    public void setGender(String gender){
    
        this.gender = gender;
    }
    
    public String getGender(){
    
        return gender;
    }
    
    public void setCountry(String country){
    
        this.country = country;
    }
    
    public String getCountry(){
    
        return country;
    }
}