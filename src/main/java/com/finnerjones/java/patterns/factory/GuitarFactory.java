package com.finnerjones.java.patterns.factory;

/**
 * Created by finner on 13/1/17.
 */
public class GuitarFactory {

    public static final String TELECASTER = "Telecaster";

    public Guitar createGuitar(String guitarModel) {
        if (guitarModel.equalsIgnoreCase(TELECASTER)) {
            return new Telecaster();
        } else {
            return new Telecaster();
        }
    }

}
