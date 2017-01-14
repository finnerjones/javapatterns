package com.finnerjones.java.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by finner on 14/1/17.
 */
public class Band {

    private List<Instrument> instruments = new ArrayList<Instrument>();

    public void addInstrument(Instrument instrumentToAdd) {
        instruments.add(instrumentToAdd);
    }

    public void printInstruments() {
        instruments.stream()
            .forEach(
                i -> System.out.println(i.name() + ", " + i.type().type() + ", " + i.specialInstructions())
            );
    }

    public int numberOfInstruments() {
        return instruments.size();
    }

}
