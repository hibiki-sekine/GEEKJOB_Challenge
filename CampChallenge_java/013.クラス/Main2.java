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
public class Main2 {
    
    public static void main(String[] args){
        Class2 human = new Class2();
        human.setProfile("Hibiki Sekine", 21, "Tokyo");
        human.printProfile();
        human.clearProfile();
        human.printProfile();
    }
    
}
