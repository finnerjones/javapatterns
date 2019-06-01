# Java Patterns - Implementations & Usage

A project to demonstrate design patterns in Java.

[![Build Status](https://travis-ci.org/finnerjones/javapatterns.svg?branch=develop)](https://travis-ci.org/finnerjones/javapatterns)


---

### Notes on upgrading to Java 11

- Download [IntelliJ 2019 JBR 11](https://www.jetbrains.com/idea/download)
    - I had an issue the some keymaps on a Spanish Keyboard on MacOS
        - Help -> Edit Custom Properties : add the line
            - `actionSystem.force.alt.gr=true`
        - Help -> Edit Custom VM Options : add the line
            - `-Dcom.jetbrains.use.old.keyevent.processing=true`

- I also had to install the `gradlew` wrapper in order for Gradle to recognize the Java version 11
    - run the task `gradle wrapper` make sure it is 5.0+ at least
    - add `sourceCompatibility = 11` to `build.gradle`
    - add `targetCompatibility = 11` to `build.gradle`


----

## Running & testing the code

This project uses Gradle as the build tool.

See [here](https://docs.gradle.org/current/userguide/tutorial_java_projects.html) for more information on Gradle with java projects.


* **Build the project** with the command below from the project root

   `./gradlew build`

   A `jar` asset is created in the `build\libs` folder of the project

* **Run the unit tests** with the command below from the project root

   `./gradlew test`

   Test results generated as *html* in 
   
   `build\reports\tests\test\index.html`
  
* **Gradle tasks** 
   
   `./gradlew tasks`  -  lists the available tasks for the project
   
   `./gradlew clean`  -  deletes the `build` directory
   
   `./gradlew build`  -  builds the project and generates a JAR
   
   `./gradlew test`   -  runs the unit tests
   
   
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

### Decorator

* Structural

#### Examples

```
BasicElectricGuitar beg = new BasicElectricGuitar();
beg.make();
beg.listFeatures();
```

Output from `beg.listFeatures()`
```
Making a BasicElectricGuitar
Jack Socket,Volume Control,Tone Controls x 2
```

```
BasicElectricGuitar beg = new BasicElectricGuitar();
TremoloGuitarDecorator tg = new TremoloGuitarDecorator(beg);
tg.make();
tg.listFeatures();
```

Output from `tg.listFeatures()`

```
Adding Tremolo arm to guitar
Jack Socket,Volume Control,Tone Controls x 2,Tremolo Arm
```