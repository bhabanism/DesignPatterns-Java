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
public class CarBuilderImpl implements VehicleBuilder {
    private Vehicle car;

    public CarBuilderImpl() {
        car = new Vehicle();
    }

    @Override
    public VehicleBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public VehicleBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Vehicle build() {
        return car;
    }
}
