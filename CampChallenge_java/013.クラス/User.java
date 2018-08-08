/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.mypackage;

import java.util.ArrayList;

/**
 *
 * @author hibikisekine
 */
public class User extends Human{
    
    User(){
        this.myCards = new ArrayList<Integer>();
    }
    
    public int open(){
        return getTotal();
    }
    
    public void setCard(ArrayList<Integer> a){
        if(a != null){
            for(int i=0;i<a.size();i++){
                Integer card = a.get(i);
                this.myCards.add(card);
            }
        }
    }
    
    public boolean checkSum(){
        int sum = getTotal();
        if(sum >= 17){
            return false;
        }
        return true;
    }
    
    int getTotal(){
        int total = 0;
//        for(Integer num : this.myCards){
        for(int i=0;i<this.myCards.size();i++){
            Integer num = this.myCards.get(i);
            total += num;
        }
        return total;
    }
    
}
