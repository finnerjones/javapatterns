package com.finnerjones.java.patterns.decorator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by finner on 24/1/17.
 */
public class GuitarDecoratorTest {



    @Test
    void guitarDoesNotHaveTremoloFeture() {
        BasicElectricGuitar beg = new BasicElectricGuitar();
        beg.make();
        assertTrue(!beg.listFeatures().contains("Tremolo Arm"));
    }

    @Test
    void guitarHasTremoloFeture() {
        BasicElectricGuitar beg = new BasicElectricGuitar();
        TremoloGuitarDecorator tg = new TremoloGuitarDecorator(beg);
        tg.make();
        assertTrue(tg.listFeatures().contains("Tremolo Arm"));
    }
}
