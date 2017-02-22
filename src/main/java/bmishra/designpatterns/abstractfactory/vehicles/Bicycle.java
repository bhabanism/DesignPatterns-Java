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
public class Bicycle extends VehicleAbstractFactory {

    public Bicycle() {
        this.setWheels(2);
        this.setBody(true);
        this.setHandle(true);
        this.setPaddle(true);
    }
}
