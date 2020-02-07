/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Nichole
 */

@RunWith(Parameterized.class)

public class ParameterizedTest {
    private int expectedResult;
    private int input;
    
    @Before
    public void initialize(){
        Factorial test = new Factorial();
    }
    
    public ParameterizedTest(int expectedResult, int input) {
        this.expectedResult = expectedResult;
        this.input = input;
        
    }
    /**
     * Test of factorial method, of class Factorial.
     */
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {{6,3},{2,2},{120,5},{24,4}});
        
    }
    
    @Test
    public void testFactorial() {
        Factorial test = new Factorial();
        assertEquals(expectedResult, test.factorial(input));
    }
    
}
