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

    @Test
    public void anInvalidGuitarTypeCreatesStratocaster() {
        Guitar myGuitar = guitarFactory.createGuitar("myGuitar");

        Assert.assertNotNull(myGuitar);
        Assert.assertTrue("The guitar type should be Stratocaster", myGuitar.type().equalsIgnoreCase("Stratocaster"));
    }

    @Test
    public void createStratocaster() {
        Guitar stratocastor = guitarFactory.createGuitar("Stratocastor");

        Assert.assertNotNull(stratocastor);
        Assert.assertTrue("The guitar type should be Stratocastor", stratocastor.type().equalsIgnoreCase("Stratocaster"));

    }

    @Test
    public void createStratocasterInLowercase() {
        Guitar stratocastor = guitarFactory.createGuitar("stratocastor");

        Assert.assertNotNull(stratocastor);
        Assert.assertTrue("The guitar type should be Stratocastor", stratocastor.type().equalsIgnoreCase("Stratocaster"));

    }


}
