/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.decorator;

/**
 * @author reus
 * @version $Id: Person.java, v 0.1 2018-03-26 reus Exp $
 */
public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }
}