package com.finnerjones.java.patterns.abstractfactory;

/**
 * Created by finner on 13/1/17.
 */
public class Telecaster implements Guitar {

    @Override
    public String model() {
        return "Telecaster";
    }
}
