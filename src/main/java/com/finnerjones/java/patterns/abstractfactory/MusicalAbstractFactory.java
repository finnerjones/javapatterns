package com.finnerjones.java.patterns.abstractfactory;

/**
 * Created by finner on 13/1/17.
 */
public abstract class MusicalAbstractFactory {

    abstract Percussion getPercussion(String percussionType);
    abstract Guitar getGuitar(String guitarModel);
}
