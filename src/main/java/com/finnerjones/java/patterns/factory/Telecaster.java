package com.finnerjones.java.patterns.factory;

public class Telecaster implements Guitar {

  @Override
  public String type() {
    return "Telecaster";
  }
}
