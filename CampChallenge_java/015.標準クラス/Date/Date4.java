/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author hibikisekine
 */
public class Date4 {
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date();
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        
        c1.set(2015,0,1,0,0,0);
        c2.set(2015,11,31,23,59,59);
        
        d1 = c1.getTime();
        d2 = c2.getTime();
        
        System.out.println(d2.getTime() - d1.getTime());
    }
}
