/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.simple;

/**
 * @author reus
 * @version $Id: Main.java, v 0.1 2018-03-15 reus Exp $
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}