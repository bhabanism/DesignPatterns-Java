/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.singleton;

/**
 *
 * @author bmishra
 */
public class Singleton {
    
    private Singleton() {
        
    }
    private static String value = "singleton";
    private static final Singleton singleton = new Singleton();
    
    public static Singleton getInstance() {
        return singleton;
    }

    public static String getValue() {
        return value;
    }

    public static void setValue(String value) {
        Singleton.value = value;
    }   
    
}
