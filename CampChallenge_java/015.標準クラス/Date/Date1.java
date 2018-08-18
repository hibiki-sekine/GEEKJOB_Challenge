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
public class Date1 {
    public static void main(String[] args){
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.set(2016,0,1,0,0,0);
        d = c.getTime();
        System.out.print(d.getTime());
    }
}
