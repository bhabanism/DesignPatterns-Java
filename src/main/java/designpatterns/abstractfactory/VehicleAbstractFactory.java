/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.abstractfactory;

/**
 *
 * @author Mishra
 */
public abstract class VehicleAbstractFactory {
    int wheels; //can be any other objects - family of object - composition
    boolean body;
    boolean handle;
    boolean stirring;
    boolean engine;
    boolean paddle;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    public void setStirring(boolean stirring) {
        this.stirring = stirring;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setPaddle(boolean paddle) {
        this.paddle = paddle;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isBody() {
        return body;
    }

    public boolean isHandle() {
        return handle;
    }

    public boolean isStirring() {
        return stirring;
    }

    public boolean isEngine() {
        return engine;
    }

    public boolean isPaddle() {
        return paddle;
    }
    
    
    
}
