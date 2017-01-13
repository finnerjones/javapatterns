package com.finnerjones.java.patterns.abstractfactory;

/**
 * Created by finner on 13/1/17.
 */
public class GuitarFactory extends MusicalAbstractFactory {

    @Override
    public Guitar getGuitar(String guitarModel) {
        if (guitarModel == null) {
            return null;
        }

        if (guitarModel.equalsIgnoreCase("Stratocaster")) {
            return new Stratocaster();
        }

        if (guitarModel.equalsIgnoreCase("Telecaster")) {
            return new Telecaster();
        }

        return null;
    }

    @Override
    public Percussion getPercussion(String percussionType) {
        return null;
    }
}
