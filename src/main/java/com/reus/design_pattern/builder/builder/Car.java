/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.builder;

/**
 * @author reus
 * @version $Id: Car.java, v 0.1 2018-03-20 reus Exp $
 */
public class Car {

    private Engine engine;

    private Tyre   tyre;

    private Seat   seat;

    public void intro() {
        this.engine.intro();
        this.tyre.intro();
        this.seat.intro();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}

class Engine {
    public void intro() {
        System.out.println("开得快");
    }
}

class Tyre {
    public void intro() {
        System.out.println("耐磨防滑");
    }
}

class Seat {
    public void intro() {
        System.out.println("坐得舒适");
    }
}