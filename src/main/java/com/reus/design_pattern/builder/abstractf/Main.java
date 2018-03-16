/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.abstractf;

/**
 * @author reus
 * @version $Id: Main.java, v 0.1 2018-03-16 reus Exp $
 */
public class Main {

    public static void main(String[] args) {
        CarFactory factory = new HighEndCarFactory();

        Engine engine = factory.createEngine();
        engine.run();

        Tyre tyre = factory.createTyre();
        tyre.use();

        Seat seat = factory.createSeat();
        seat.feel();

    }

}