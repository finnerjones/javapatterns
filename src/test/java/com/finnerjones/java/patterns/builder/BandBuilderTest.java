package com.finnerjones.java.patterns.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by finner on 14/1/17.
 */
class BandBuilderTest {


    @Test
    void buildThreePieceBand() {
        BandBuilder bb = new BandBuilder();
        Band band = bb.buildThreePieceBand();

        assertNotNull(band);
        assertTrue(band.numberOfInstruments() == 3, "Expecting 3 instruments" );
    }

    @Test
    void buildFivePieceBand() {
        BandBuilder bb = new BandBuilder();
        Band band = bb.buildFivePieceBand();

        assertNotNull(band);
        assertTrue(band.numberOfInstruments() == 5, "Expecting 3 instruments" );
    }

}
