/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototype;

import static org.hamcrest.core.IsNot.not;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author bmishra
 */
public class PrototypeTest {    
    
    @Test
    public void testPrototype() {
        BloodCell bloodcell1 = new BloodCell("ACGTGTCA");
        BloodCell bloodcell2 = bloodcell1.replicate();
        Assert.assertEquals(bloodcell2.getDNA().getSEQUENCE(), bloodcell1.getDNA().getSEQUENCE());        
        Assert.assertThat(bloodcell2.getDNA(), not(bloodcell1.getDNA()));
    }
    
}
