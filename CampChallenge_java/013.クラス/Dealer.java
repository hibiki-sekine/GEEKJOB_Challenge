/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.mypackage;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hibikisekine
 */
public class Dealer extends Human{
    protected ArrayList<Integer> cards = new ArrayList<>();
    
    Dealer(){
       for(int i=1; i<=13; i++){
           for(int j=0; j<4; j++){
               if(i > 10){
                   cards.add(10);
               }
               cards.add(i);
           }
       }
       
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
    
    
    public ArrayList<Integer> deal(){
        ArrayList<Integer> result = new ArrayList<>();
        
        Random rand = new Random();
        
        for(int i=0; i<2; i++){
            Integer randomNum = rand.nextInt(52);
            result.add(this.cards.get(randomNum));
            this.cards.remove(randomNum);
        }
        return result;
    }
    
    public ArrayList<Integer> hit(){
        ArrayList<Integer> result = new ArrayList<>();
        
        Random rand = new Random();
        
        Integer randomNum = rand.nextInt(52);
        result.add(this.cards.get(randomNum));
        this.cards.remove(randomNum);
        
        return result;
    }
    
    int getTotal(){
        int total = 0;
        for(int i=0;i<this.myCards.size();i++){
            Integer num = this.myCards.get(i);
            total += num;
        }
        return total;
    }
}    

