/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.lang.Math;

/**
 *
 * @author hibikisekine
 */
public class File3 {
    public static void main(String[] args){
        try{
            File fp = new File("log.txt");
            FileWriter fw = new FileWriter(fp,true);
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fw.write("計算処理\n");
            fw.write(sdf.format(c.getTime()) + " 開始\n");
            
            double x = 200;
            double y = 300;
            double z = Math.exp(x);
            System.out.print(z);
            
            fw.write(sdf.format(c.getTime()) + " 終了\n");
            fw.close();
            
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