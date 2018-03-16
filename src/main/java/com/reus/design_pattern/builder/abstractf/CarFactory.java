/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.abstractf;

/**
 * 抽象工厂方法
 * @author reus
 * @version $Id: CarFactory.java, v 0.1 2018-03-16 reus Exp $
 */
public interface CarFactory {
    //引擎
    Engine createEngine();

    //轮胎
    Tyre createTyre();

    //座椅
    Seat createSeat();
}