/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.simple;

/**
 * @author reus
 * @version $Id: PizzaFactory.java, v 0.1 2018-03-15 reus Exp $
 */
public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
        }
        return pizza;
    }
}