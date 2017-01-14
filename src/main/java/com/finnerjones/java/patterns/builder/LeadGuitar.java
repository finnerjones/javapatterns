package com.finnerjones.java.patterns.builder;

/**
 * Created by finner on 14/1/17.
 */
public class LeadGuitar extends TelecasterGuitar {

    @Override
    public String name() {
        return "Lead Guitar";
    }

    @Override
    public String specialInstructions() {
        return "Setup middle frontline of stage";
    }
}
