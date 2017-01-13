package com.finnerjones.java.patterns.abstractfactory;

/**
 * Created by finner on 13/1/17.
 */
public class MusicalFactoryProducer {


    public static MusicalAbstractFactory getFactory(String factoryType){
        if (factoryType.equalsIgnoreCase("PERCUSSION")) {
            return new PercussionFactory();
        } else if (factoryType.equalsIgnoreCase("GUITAR")) {
            return new GuitarFactory();
        }

        return null;
    }
}
