/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

/**
 *
 * @author Mishra
 */
public class AddOctalNumbers {
    public static String addOctalNumbers(int a, int b) {
        return Integer.toOctalString(addNumbers(a, b));
    }
    
    private static int addNumbers(int a, int b) {
        return a + b;
    }
}
