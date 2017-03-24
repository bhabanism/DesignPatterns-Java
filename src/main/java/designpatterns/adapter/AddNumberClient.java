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
public class AddNumberClient {
    
    public static void main(String[] args) {
        //Old implementation
        
        /*String oct = AddOctalNumbers.addOctalNumbers(02, 07);
        System.out.println("oct :: " + oct);*/
        
        
        //New requirement hexodecimal!
        String hex = AddHexaDecimal.addHexNumbers(07, 07);
        System.out.println("hex :: " + hex);
        
    }
    
}
