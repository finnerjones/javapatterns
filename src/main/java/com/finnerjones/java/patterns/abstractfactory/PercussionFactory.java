package com.finnerjones.java.patterns.abstractfactory;

/**
 * Created by finner on 13/1/17.
 */
public class PercussionFactory extends MusicalAbstractFactory {

    @Override
    public Guitar getGuitar(String guitarModel) {
        return null;
    }

    @Override
    public Percussion getPercussion(String percussionType) {
        if (percussionType == null) {
            return null;
        }

        if (percussionType.equalsIgnoreCase("Drums")) {
            return new HiHat();
        }

        if (percussionType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }

        if (percussionType.equalsIgnoreCase("BassDrum")) {
            return new BassDrum();
        }

        return null;
    }
}
