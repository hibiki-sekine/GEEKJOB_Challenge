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
public class File2 {
    public static void main(String[] args){
        try{
            File fp = new File("profile.txt");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
