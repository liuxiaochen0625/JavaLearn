/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.abstractf;

/**
 * @author reus
 * @version $Id: LowEndCarFactory.java, v 0.1 2018-03-16 reus Exp $
 */
public class LowEndCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LowEndTyre();
    }

    @Override
    public Seat createSeat() {
        return new LowEndSeat();
    }
}