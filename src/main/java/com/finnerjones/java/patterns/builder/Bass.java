package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class Bass implements Instrument {
    @Override
    public String name() {
        return "Bass";
    }

    @Override
    public InstrumentType type() {
        return new Guitar();
    }

    @Override
    public String specialInstructions() {
        return "Setup at front left of stage";
    }
}
