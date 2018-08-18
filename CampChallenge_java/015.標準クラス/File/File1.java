/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;

/**
 *
 * @author hibikisekine
 */
public class File1 {
    public static void main(String[] args){
        try{
            File fp = new File("profile.txt");
        
            FileWriter fw = new FileWriter(fp);
            fw.write("私の名前は関根響です。\n");
            fw.write("好きな食べ物はかつ丼です。\n");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
