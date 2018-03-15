/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.factory;

import com.reus.design_pattern.builder.simple.CheesePizza;
import com.reus.design_pattern.builder.simple.Pizza;

/**
 * @author reus
 * @version $Id: CheeseFactory.java, v 0.1 2018-03-15 reus Exp $
 */
public class CheeseFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}