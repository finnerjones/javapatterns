package com.finnerjones.java.patterns.factory;

/**
 * Created by finner on 13/1/17.
 */
public class GuitarFactory {

    public static final String TELECASTER = "Telecaster";
    public static final String STRATOCASTER = "Stratocaster";


    public Guitar createGuitar(String guitarModel) {
        if (guitarModel.equalsIgnoreCase(STRATOCASTER)) {
            return new Stratocaster();
        }


        if (guitarModel.equalsIgnoreCase(TELECASTER)) {
            return new Telecaster();
        } else {
            // default guitar type
            return new Stratocaster();
        }
    }

}
