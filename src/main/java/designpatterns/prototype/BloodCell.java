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
public class BloodCell implements Replicable {
    
    private DNA dna;
    
    public BloodCell(String sequence) {
        this.dna = new DNA(sequence);
    }
    
    public BloodCell replicate() {
        try {
            BloodCell bloodcellTemp = (BloodCell) this.clone(); 
            bloodcellTemp.dna = (DNA) this.dna.replicate();  
            return bloodcellTemp;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(BloodCell.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public DNA getDNA() {
        return dna;
    }
    
}
