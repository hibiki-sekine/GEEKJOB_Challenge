/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author hibikisekine
 */
public class Date3 {
    public static void main(String[] args){
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.set(2016,10,4,10,0,0);
        d = c.getTime();
        System.out.println(d.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));
    }
    
}
