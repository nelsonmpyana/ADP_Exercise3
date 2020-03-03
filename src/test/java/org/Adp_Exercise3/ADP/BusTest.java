package org.Adp_Exercise3.ADP;
import org.junit.Assert;
import org.junit.Test;
public class BusTest {
    private String busCompanyName;
    @Test
    public void move(){
        busCompanyName = "MyCiti";
        Assert.assertEquals(busCompanyName + " is moving very fast", busCompanyName + " is moving very fast");
    }

    @Test
    public void wheels(){
        Assert.assertEquals("Bus has eight wheels", "Bus has eight wheels");
    }
}
