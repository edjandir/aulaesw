/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author edjandir
 */
public class UtilsTest {

    public UtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("* UtilsTest: @BeforeClass method");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsTest: @AfterClass method");
    }

    @Before
    public void setUp() {
        System.out.println("* UtilsTest: @Before method");
    }

    @After
    public void tearDown() {
        System.out.println("* UtilsTest: @After method");
    }

    /**
     * Test of helloWorldCheck method, of class Utils.
     */
    @Test
    public void helloWorldCheck() {
        System.out.println("* UtilsTest: teste method 1 - helloWorldCheck()");
        assertEquals("Hello, World!", Utils.concatWords("Hello", ", ", "World", "!"));
    }

    /** Testando timeout */
    @Test(timeout=1000)
    public void testWithTimeout() {
        System.out.println("* UtilsTest: teste method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    /** Testando argumento inválido
     *  Exceção @IllegalArgumentException deve ser lançada
     */
    
    @Test(expected=IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("* UtilsTest: teste method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("* UtilsTest: teste method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
}
