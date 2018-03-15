package com.reus.design_pattern.builder.factory;

import com.reus.design_pattern.builder.simple.Pizza;

/**
 * @author reus
 * @version $Id: PizzaFactory.java, v 0.1 2018-03-15 reus Exp $
 */
public interface PizzaFactory {
    Pizza createPizza();
}
