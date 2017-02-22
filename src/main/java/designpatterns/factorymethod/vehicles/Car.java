/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factorymethod.vehicles;

import designpatterns.factorymethod.Vehicle;

/**
 *
 * @author Mishra
 */
public class Car extends Vehicle {
    public Car() {
        this.setWheels(4);
        this.setBody(true);        
        this.setEngine(true);
        this.setStirring(true);
    }    
}
