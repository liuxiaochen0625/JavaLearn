/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.abstractf;

/**
 * 轮胎
 * @author reus
 * @version $Id: Tyre.java, v 0.1 2018-03-16 reus Exp $
 */
public interface Tyre {

    void use();

}

class HighEndTyre implements Tyre {
    @Override
    public void use() {
        System.out.println("高端轮胎，耐磨防滑");
    }

}

class LowEndTyre implements Tyre {
    @Override
    public void use() {
        System.out.println("低端轮胎，磨损大，易打滑");
    }

}