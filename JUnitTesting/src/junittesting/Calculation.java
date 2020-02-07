/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

/**
 *
 * @author Nichole
 */
public class Calculation {
    int firstInt, secInt;
    
    public Calculation (int firstInt, int secInt){
        this.firstInt = firstInt;
        this.secInt = secInt;
    }
    
    public String add(){
        return String.valueOf(firstInt + secInt);
    }
    
    public String subtract(){
        return String.valueOf(firstInt - secInt);
    }
    
    public String multiply(){
        return String.valueOf(firstInt * secInt);
    }
    
    public String divide(){
        return String.format("%.2f", (double)firstInt/secInt);
    }
}
