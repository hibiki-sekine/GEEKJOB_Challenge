/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author hibikisekine
 */
public class String1 {
    public static void main(String[] args){
        String name = "関根響";
        int bytenum = name.getBytes().length;
        int stringnum = name.length();
        
        System.out.println(bytenum);
        System.out.println(stringnum);
    }
}
