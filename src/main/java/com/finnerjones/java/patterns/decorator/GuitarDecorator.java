package com.finnerjones.java.patterns.decorator;

import java.util.List;

/**
 * Created by finner on 24/1/17.
 */
public class GuitarDecorator implements Guitar {

    protected Guitar guitar;

    public GuitarDecorator(Guitar g) {
        this.guitar = g;
    }

    @Override
    public List<String> make() {
        return guitar.make();
    }

    @Override
    public String listFeatures() {
        return guitar.listFeatures();
    }

}
