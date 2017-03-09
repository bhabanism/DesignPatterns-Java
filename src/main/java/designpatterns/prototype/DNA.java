/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bmishra
 */
public class DNA implements Replicable {
    private String DNA_SEQUENCE = "CTGTAT";   
    
    public DNA (String sequence) {
        this.DNA_SEQUENCE = sequence;        
    }
    
    public String getSEQUENCE() {
        return DNA_SEQUENCE;
    }

    @Override
    public Replicable replicate() {
        try {
            return (DNA)this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(DNA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
