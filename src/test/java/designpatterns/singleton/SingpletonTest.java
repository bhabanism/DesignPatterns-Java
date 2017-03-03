/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author bmishra
 */
public class SingpletonTest {    
    
    @Test
    public void testSingleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.setValue("value1");
        Assert.assertEquals(singleton1.getValue(), singleton2.getValue());        
    }
    
}
