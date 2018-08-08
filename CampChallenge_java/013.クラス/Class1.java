/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author hibikisekine
 */
public class Class1 {
    
    String name = null;
    int age = 0;
    String address = null;
    
    void setProfile(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    void printProfile(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    } 
    
}
