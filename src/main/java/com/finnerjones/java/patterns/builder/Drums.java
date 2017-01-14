package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class Drums implements Instrument {

    @Override
    public String name() {
        return "Drums";
    }

    @Override
    public InstrumentType type() {
        return new Percussion();
    }

    @Override
    public String specialInstructions() {
        return "Setup to the back left of stage";
    }

}
