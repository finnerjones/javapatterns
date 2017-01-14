package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class BandBuilder {

    public Band buildFivePieceBand() {
        Band band = new Band();
        band.addInstrument(new LeadGuitar());
        band.addInstrument(new RythymGuitar());
        band.addInstrument(new ElectricPiano());
        band.addInstrument(new Bass());
        band.addInstrument(new Drums());
        return band;
    }

    public Band buildThreePieceBand() {
        Band band = new Band();
        band.addInstrument(new LeadGuitar());
        band.addInstrument(new Bass());
        band.addInstrument(new Drums());
        return band;
    }


}
