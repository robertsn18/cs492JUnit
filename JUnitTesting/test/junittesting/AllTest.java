/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Nichole
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({junittesting.CalculationTest.class, junittesting.ParameterizedTest.class, junittesting.FactorialTest.class})
public class AllTest {
    
}
