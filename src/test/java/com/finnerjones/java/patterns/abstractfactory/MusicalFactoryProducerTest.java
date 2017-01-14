package com.finnerjones.java.patterns.abstractfactory;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by finner on 13/1/17.
 */
public class MusicalFactoryProducerTest {

    @Test
    public void createTelecastorGuitar() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Telecaster");

        Assert.assertNotNull(guitar);
        Assert.assertTrue("Expecting a Telecaster guitar", guitar.model().equalsIgnoreCase("Telecaster"));
    }


    @Test
    public void createGibsonGuitarReturnsNull() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Gibson");

        Assert.assertNull(guitar);
    }

    @Test
    public void guitarFactoryWillNotCreatePercussion() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Percussion percussion = gf.getPercussion("Drums");

        Assert.assertNull(percussion);
    }


    @Test
    public void percussionFactoryWillNotCreateGuitars() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Guitar guitar = pf.getGuitar("Telecaster");

        Assert.assertNull(guitar);
    }



    @Test
    public void createStratocastorGuitar() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Stratocaster");

        Assert.assertNotNull(guitar);
        Assert.assertTrue("Expecting a Stratocaster guitar", guitar.model().equalsIgnoreCase("Stratocaster"));
    }

    @Test
    public void createHiHatPercussion() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Percussion percussion = pf.getPercussion("Drums");

        Assert.assertNotNull(percussion);
        Assert.assertTrue("Expecting a Hi Hat percussion", percussion.type().equalsIgnoreCase("Hi Hat"));
    }


    @Test
    public void createBassDrumPercussion() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Percussion percussion = pf.getPercussion("BassDrum");

        Assert.assertNotNull(percussion);
        Assert.assertTrue("Expecting a Bass Drum percussion", percussion.type().equalsIgnoreCase("Bass Drum"));
    }
}
