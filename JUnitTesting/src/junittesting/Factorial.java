/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

/**
 * Calculate the factorial of a number
 */
public class Factorial {
    public int factorial(int n){
        if(n < 0)
            throw new IllegalArgumentException("Factorial cannot handle negative numbers!!");
        if(n==0)
            return 1;
        else
            return n * factorial (n-1);
    }
}
