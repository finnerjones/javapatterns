package com.finnerjones.java.patterns.builder;

/**
 *
 *
 * Instrument :   Guitar, Drum, Piano, Microphone
 *
 *
 *
 *
 *
 * Created by finner on 14/1/17.
 */
public interface Instrument {

    String name();
    InstrumentType type();
    String specialInstructions();

}
