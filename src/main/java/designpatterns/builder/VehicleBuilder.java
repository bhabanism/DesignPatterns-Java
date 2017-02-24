/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.builder;

/**
 *
 * @author bmishra
 */
public interface VehicleBuilder {
    VehicleBuilder setWheels(final int wheels);
    VehicleBuilder setColor(final String color);
    Vehicle build();
}
