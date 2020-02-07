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
public class CalculationTest {
    
    public CalculationTest() {
    }

    /**
     * Test of add method, of class Calculation.
     */
    @Test
    public void testAdd() {
        Calculation sum = new Calculation(2, 2);
        String expected = "4";
        String actual = sum.add();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of subtract method, of class Calculation.
     */
    @Test
    public void testSubtract() {
        Calculation result = new Calculation(2, 2);
        String expected = "0";
        String actual = result.subtract();
        assertEquals(expected, actual);
    }

    /**
     * Test of multiply method, of class Calculation.
     */
    @Test
    public void testMultiply() {
        Calculation product = new Calculation(2, 2);
        String expected = "4";
        String actual = product.multiply();
        assertEquals(expected, actual);
    }

    /**
     * Test of divide method, of class Calculation.
     */
    @Test
    public void testDivide() {
        Calculation dividend = new Calculation(2, 2);
        String expected = "1.00";
        String actual = dividend.divide();
        assertEquals(expected, actual);
    }
    
}
