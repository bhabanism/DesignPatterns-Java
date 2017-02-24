/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.builder;

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
public class VehicleBuilderTest {
    
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

    @Test
    public void testCarBuilder() {
        VehicleBuilder builder = new CarBuilderImpl();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        Vehicle car = carBuildDirector.construct();
        assertEquals(car.getWheels(),4);
    }
    
    @Test
    public void testBikeBuilder() {
        VehicleBuilder builder = new BikeBuilderImpl();
        BikeBuildDirector bikeBuildDirector = new BikeBuildDirector(builder);
        Vehicle car = bikeBuildDirector.construct();
        assertEquals(car.getWheels(), 2);
    }    
}
