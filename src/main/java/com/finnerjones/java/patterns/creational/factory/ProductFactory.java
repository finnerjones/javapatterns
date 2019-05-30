package com.finnerjones.java.patterns.creational.factory;

public class ProductFactory {

    Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else {
            return new ProductB();
        }
    }
}
