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
public class BikeBuildDirector {
    private VehicleBuilder builder;

    public BikeBuildDirector(final VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle construct() {
        return builder.setWheels(2).setColor("Black").build();
    }    
}
