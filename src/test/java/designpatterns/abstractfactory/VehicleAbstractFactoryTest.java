/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.abstractfactory;

import designpatterns.abstractfactory.vehicles.Bicycle;
import designpatterns.abstractfactory.vehicles.Car;
import designpatterns.abstractfactory.vehicles.Motorcycle;
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
public class VehicleAbstractFactoryTest {
    
    public VehicleAbstractFactoryTest() {
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
    public void testBicycle() {
        Bicycle bike = new Bicycle();
        //assertEquals(bike.getWheels(), 1);
        assertEquals(bike.getWheels(), 2);
    }
    
    /**
     * Test of setWheels method, of class Vehicle.
     */
    @Test
    public void testMotorcycle() {
       Motorcycle motobike = new Motorcycle();
       //assertEquals(motobike.getWheels(), 3);
       assertEquals(motobike.getWheels(), 2);
    }
    
    /**
     * Test of setWheels method, of class Vehicle.
     */
    @Test
    public void testCar() {
        Car car = new Car();
        //assertEquals(car.getWheels(), 5);
        assertEquals(car.getWheels(), 4);
    }
}
