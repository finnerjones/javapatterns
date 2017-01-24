# Java Patterns - Implementations & Usage

A project to demonstrate design patterns in Java.

[![Build Status](https://travis-ci.org/finnerjones/javapatterns.svg?branch=develop)](https://travis-ci.org/finnerjones/javapatterns)

----

## Running & testing the code

This project uses Gradle as the build tool.

See [here](https://docs.gradle.org/current/userguide/tutorial_java_projects.html) for more information on Gradle with java projects.


* **Build the project** with the command below from the project root

   `gradle build`

   A `jar` asset is created in the `build\libs` folder of the project

* **Run the unit tests** with the command below from the project root

   `gradle test`

   Test results generated as *html* in 
   
   `build\reports\tests\test\index.html`
  
* **Gradle tasks** 
   
   `gradle tasks`  -  lists the available tasks for the project
   
   `gradle clean`  -  deletes the `build` directory
   
   `gradle build`  -  builds the project and generates a JAR
   
   `gradle test`   -  runs the unit tests
   
   
----

## Patterns

The Patterns are based on [this site](https://www.tutorialspoint.com/design_pattern/)

### Factory

* Category : Creational

#### Examples

```
Guitar telecaster = guitarFactory.createGuitar("Telecaster");
```

```
Guitar stratocastor = guitarFactory.createGuitar("Stratocastor");
```

### Abstract Factory

* Category : Creational

#### Examples

```
MusicalAbstractFactory gf = MusicalFactoryProducer.getFactory("GUITAR");
Guitar guitar = gf.getGuitar("Gibson");
```

```
MusicalAbstractFactory pf = MusicalFactoryProducer.getFactory("PERCUSSION");
Percussion percussion = pf.getPercussion("Drums");
```

### Build

* Category : Creational

#### Examples

```
BandBuilder bb = new BandBuilder();
Band band = bb.buildThreePieceBand();
```

```
BandBuilder bb = new BandBuilder();
Band band = bb.buildFivePieceBand();
```