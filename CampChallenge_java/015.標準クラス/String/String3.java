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
public class String3 {
    public static void main(String[] args){
        String s = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String changes1 = s.replace("I", "い");
        String changes2 = changes1.replace("U", "う");
        System.out.println(changes2);
    }
}
