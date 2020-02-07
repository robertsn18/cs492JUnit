/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nichole
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of factorial method, of class Factorial.
     */
    @Test (expected=IllegalArgumentException.class) //Will Pass is Exception Found
    public void testFactorial() {
        Factorial test = new Factorial();
        int test1;
        test1 = test.factorial(-3); 
    }
    
}
