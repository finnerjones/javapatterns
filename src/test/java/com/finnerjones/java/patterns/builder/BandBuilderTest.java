package com.finnerjones.java.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by finner on 14/1/17.
 */
public class BandBuilderTest {


    @Test
    public void buildThreePieceBand() {
        BandBuilder bb = new BandBuilder();
        Band band = bb.buildThreePieceBand();

        Assert.assertNotNull(band);
        Assert.assertTrue("Expecting 3 instruments", band.numberOfInstruments() == 3 );
    }

    @Test
    public void buildFivePieceBand() {
        BandBuilder bb = new BandBuilder();
        Band band = bb.buildFivePieceBand();

        Assert.assertNotNull(band);
        Assert.assertTrue("Expecting 3 instruments", band.numberOfInstruments() == 5 );
    }

}
