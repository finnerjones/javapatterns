package com.finnerjones.java.patterns.decorator;

import java.util.List;

/**
 * Created by finner on 24/1/17.
 */
public class TremoloGuitarDecorator extends GuitarDecorator{

    public TremoloGuitarDecorator(Guitar g) {
        super(g);
    }

    @Override
    public List<String> make() {
        List<String> features = guitar.make();
        System.out.println("Adding Tremolo arm to guitar");
        features.add("Tremolo Arm");
        return features;
    }

    @Override
    public String listFeatures() {
        return guitar.listFeatures();
    }

}
