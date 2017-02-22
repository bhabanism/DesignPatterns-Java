/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factorymethod;

import designpatterns.factorymethod.vehicles.Bicycle;
import designpatterns.factorymethod.vehicles.Car;
import designpatterns.factorymethod.vehicles.Motorcycle;
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
public class VehicleFactoryMethodTest {
    
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
        Vehicle vehicle = new Bicycle();
        //assertEquals(bike.getWheels(), 1);
        assertEquals(vehicle.getWheels(), 2);
    }
    
    /**
     * Test of setWheels method, of class Vehicle.
     */
    @Test
    public void testMotorcycle() {
       Vehicle vehicle = new Motorcycle();
       //assertEquals(motobike.getWheels(), 3);
       assertEquals(vehicle.getWheels(), 2);
    }
    
    /**
     * Test of setWheels method, of class Vehicle.
     */
    @Test
    public void testCar() {
        Vehicle vehicle = new Car();
        //assertEquals(car.getWheels(), 5);
        assertEquals(vehicle.getWheels(), 4);
    }
}
