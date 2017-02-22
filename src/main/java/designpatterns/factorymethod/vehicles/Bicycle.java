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
public class Bicycle extends Vehicle {

    public Bicycle() {
        this.setWheels(2);
        this.setBody(true);
        this.setHandle(true);
        this.setPaddle(true);
    }
}
