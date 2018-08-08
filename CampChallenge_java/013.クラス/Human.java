/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.mypackage;

import java.util.*;

/**
 *
 * @author hibikisekine
 */
abstract class Human {
    
    protected ArrayList<Integer> myCards;
    
    abstract int open();
    abstract void setCard(ArrayList<Integer> a);
    abstract boolean checkSum();
    
}