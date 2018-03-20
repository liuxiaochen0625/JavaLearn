/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.builder;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-20 reus Exp $
 */
public class Client {

    public static void main(String[] args) {

        CarDirector director = new MyCarDirector(new MyCarBuilder());

        Car car = director.directCar();

        car.intro();

    }

}