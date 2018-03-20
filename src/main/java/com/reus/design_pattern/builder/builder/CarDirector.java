/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.builder;

/**
 * @author reus
 * @version $Id: CarDirector.java, v 0.1 2018-03-20 reus Exp $
 */
public interface CarDirector {

    Car directCar();

}

class MyCarDirector implements CarDirector {

    private CarBuilder carBuilder;

    public MyCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car directCar() {
        Engine engine = this.carBuilder.buildEngine();
        Tyre tyre = this.carBuilder.buildTyre();
        Seat seat = this.carBuilder.buildSeat();
        // 装配
        Car car = new Car();
        car.setEngine(engine);
        car.setTyre(tyre);
        car.setSeat(seat);

        return car;
    }

}