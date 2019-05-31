package com.finnerjones.java.patterns.abstractfactory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by finner on 13/1/17.
 */
class MusicalFactoryProducerTest {

    @Test
    void createTelecastorGuitar() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Telecaster");

        assertNotNull(guitar);
        assertTrue(guitar.model().equalsIgnoreCase("Telecaster"), "Expecting a Telecaster guitar");
    }


    @Test
    void createGibsonGuitarReturnsNull() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Gibson");

        assertNull(guitar);
    }

    @Test
    void guitarFactoryWillNotCreatePercussion() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Percussion percussion = gf.getPercussion("Drums");

        assertNull(percussion);
    }


    @Test
    void percussionFactoryWillNotCreateGuitars() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Guitar guitar = pf.getGuitar("Telecaster");

        assertNull(guitar);
    }



    @Test
    void createStratocastorGuitar() {
        MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
        Guitar guitar = gf.getGuitar("Stratocaster");

        assertNotNull(guitar);
        assertTrue(guitar.model().equalsIgnoreCase("Stratocaster"), "Expecting a Stratocaster guitar");
    }

    @Test
    void createHiHatPercussion() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Percussion percussion = pf.getPercussion("Drums");

        assertNotNull(percussion);
        assertTrue(percussion.type().equalsIgnoreCase("Hi Hat"), "Expecting a Hi Hat percussion");
    }


    @Test
    void createBassDrumPercussion() {
        MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
        Percussion percussion = pf.getPercussion("BassDrum");

        assertNotNull(percussion);
        assertTrue(percussion.type().equalsIgnoreCase("Bass Drum"), "Expecting a Bass Drum percussion");
    }
}
