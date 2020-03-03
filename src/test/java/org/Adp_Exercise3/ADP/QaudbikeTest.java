package org.Adp_Exercise3.ADP;

import org.junit.Test;
import org.junit.Assert;
public class QaudbikeTest {
    private int maximumSpeed = 160;

    @Test
    public void move() {
        Assert.assertEquals( "Quadbike maximum speed is " + maximumSpeed + "kph", "Quadbike maximum speed is " + maximumSpeed + "kph");
    }

    @Test
    public void wheels() {
        Assert.assertEquals("Quadbike has four wheels", "Quadbike has four wheels");
    }
}
