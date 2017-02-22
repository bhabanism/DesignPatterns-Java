/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.abstractfactory.vehicles;

import designpatterns.abstractfactory.VehicleAbstractFactory;

/**
 *
 * @author Mishra
 */
public class Car extends VehicleAbstractFactory {
    public Car() {
        this.setWheels(4);
        this.setBody(true);        
        this.setEngine(true);
        this.setStirring(true);
    }    
}
