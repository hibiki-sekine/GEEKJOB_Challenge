/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author hibikisekine
 */
public class Date2 {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
    
        System.out.println(sdf.format(now));
    }
}
