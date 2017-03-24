/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter;

import java.awt.BorderLayout;

/**
 *
 * @author Mishra
 */
public class AddHexaDecimal {
    public static String addHexNumbers(int a, int b) {
        String octalSum = AddOctalNumbers.addOctalNumbers(a, b);
        System.out.println("Integer.parseInt(octalSum, 8) : " + Integer.parseInt(octalSum, 8));
        return Integer.toHexString(Integer.parseInt(octalSum, 8));
    }
    
}
