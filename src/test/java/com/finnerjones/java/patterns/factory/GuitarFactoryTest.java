package com.finnerjones.java.patterns.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by finner on 13/1/17.
 */
public class GuitarFactoryTest {

    public GuitarFactory guitarFactory;

    @Before
    public void setup() {
        guitarFactory = new GuitarFactory();
    }


    @Test
    public void createTelecaster() {
        Guitar telecaster = guitarFactory.createGuitar("Telecaster");

        Assert.assertNotNull(telecaster);
        Assert.assertTrue("The guitar type should be Telecaster", telecaster.type().equalsIgnoreCase("Telecaster"));
    }


}
