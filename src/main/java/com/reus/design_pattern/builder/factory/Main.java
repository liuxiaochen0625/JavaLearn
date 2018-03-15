/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.factory;

import com.reus.design_pattern.builder.simple.Pizza;

/**
 * @author reus
 * @version $Id: Main.java, v 0.1 2018-03-15 reus Exp $
 */
public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new CheeseFactory();
        Pizza pizza = factory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}