package com.finnerjones.java.patterns.creational.factory;


import org.junit.jupiter.api.Test;  // JUnit5

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductFactoryTest {

    @Test
    void verifyJUnit5() {
        assertEquals(42, Integer.sum(19, 23));
    }


    @Test
    void createProductA() {
        var pf = new ProductFactory();      // Java 11 feature : local variable Type Inference
        Product pA = pf.createProduct("A");
        assertTrue(pA instanceof ProductA);
    }

    @Test
    void createProductB() {
        var pf = new ProductFactory();
        Product pB = pf.createProduct("B");
        assertTrue(pB instanceof ProductB);
    }
}
