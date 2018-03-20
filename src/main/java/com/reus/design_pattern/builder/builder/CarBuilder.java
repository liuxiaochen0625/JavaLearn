/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.builder;

/**
 * @author reus
 * @version $Id: CarBuilder.java, v 0.1 2018-03-20 reus Exp $
 */
public interface CarBuilder {

    Engine buildEngine();

    Tyre buildTyre();

    Seat buildSeat();

}

class MyCarBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine();
    }

    @Override
    public Tyre buildTyre() {
        return new Tyre();
    }

    @Override
    public Seat buildSeat() {
        return new Seat();
    }

}