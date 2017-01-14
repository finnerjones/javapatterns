package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class RythymGuitar extends TelecasterGuitar {

    @Override
    public String name() {
        return "Rythym Guitar";
    }

    @Override
    public String specialInstructions() {
        return "Setup right frontline of stage";
    }
}
