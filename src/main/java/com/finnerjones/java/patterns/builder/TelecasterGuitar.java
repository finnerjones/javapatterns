package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class TelecasterGuitar implements Instrument {

    @Override
    public String name() {
        return "Telecaster Guitar";
    }

    @Override
    public InstrumentType type() {
        return new Guitar();
    }

    @Override
    public String specialInstructions() {
        return null;
    }
}
