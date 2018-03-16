/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.abstractf;

/**
 * @author reus
 * @version $Id: HighEndCarFactory.java, v 0.1 2018-03-16 reus Exp $
 */
public class HighEndCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HighEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new HighEndTyre();
    }

    @Override
    public Seat createSeat() {
        return new HighEndSeat();
    }
}