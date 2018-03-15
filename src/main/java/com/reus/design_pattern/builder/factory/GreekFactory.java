/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.factory;

import com.reus.design_pattern.builder.simple.GreekPizza;
import com.reus.design_pattern.builder.simple.Pizza;

/**
 * @author reus
 * @version $Id: GreekFactory.java, v 0.1 2018-03-15 reus Exp $
 */
public class GreekFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}