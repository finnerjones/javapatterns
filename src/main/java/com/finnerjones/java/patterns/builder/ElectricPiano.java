package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class ElectricPiano implements Instrument {

    @Override
    public String name() {
        return "Electric Piano";
    }

    @Override
    public InstrumentType type() {
        return new Keyboard();
    }

    @Override
    public String specialInstructions() {
        return "Setup backline to the right of the stage";
    }

}
