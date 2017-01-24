package com.finnerjones.java.patterns.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by finner on 24/1/17.
 */
public class BasicElectricGuitar implements Guitar {

    private List<String> features;

    @Override
    public List<String> make() {
        System.out.println("Making a BasicElectricGuitar");
        features = new ArrayList<String>();
        features.add("Jack Socket");
        features.add("Volume Control");
        features.add("Tone Controls x 2");
        return features;
    }

    @Override
    public String listFeatures() {
        StringBuffer sb = new StringBuffer();
        features.stream()
                .forEach(f -> sb.append(f + ","));
        String list = sb.toString().substring(0, sb.toString().length() -1);
        System.out.println(list);

        return list;
    }
}
