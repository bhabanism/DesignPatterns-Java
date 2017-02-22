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
public class Motorcycle extends VehicleAbstractFactory {
    public Motorcycle() {
        this.setWheels(2);
        this.setBody(true);
        this.setHandle(true);
        this.setEngine(true);
    }    
}
