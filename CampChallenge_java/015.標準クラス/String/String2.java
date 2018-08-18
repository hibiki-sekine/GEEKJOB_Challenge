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
public class String2 {
    public static void main(String[] args){
        String mail = "hibiki_geekjob@gmail.com";
        String s = mail.substring(mail.indexOf("@")+1);
        System.out.println(s);
    }
}
