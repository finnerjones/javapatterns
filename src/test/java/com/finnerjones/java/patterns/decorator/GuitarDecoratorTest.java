package com.finnerjones.java.patterns.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by finner on 24/1/17.
 */
public class GuitarDecoratorTest {



    @Test
    public void guitarDoesNotHaveTremoloFeture() {
        BasicElectricGuitar beg = new BasicElectricGuitar();
        beg.make();
        Assert.assertTrue(!beg.listFeatures().contains("Tremolo Arm"));
    }

    @Test
    public void guitarHasTremoloFeture() {
        BasicElectricGuitar beg = new BasicElectricGuitar();
        TremoloGuitarDecorator tg = new TremoloGuitarDecorator(beg);
        tg.make();
        Assert.assertTrue(tg.listFeatures().contains("Tremolo Arm"));
    }
}
