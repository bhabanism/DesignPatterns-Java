/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mishra
 */
public class OctalHexaAdapterTest {
    
    public OctalHexaAdapterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of setWheels method, of class Vehicle.
     */
    @Test
    public void testCar() {
        String hex = AddHexaDecimal.addHexNumbers(07, 07);
        assertEquals(Integer.parseInt(hex, 16), 0xe);
    }
}
