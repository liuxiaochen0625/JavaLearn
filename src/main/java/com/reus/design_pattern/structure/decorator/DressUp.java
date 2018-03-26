/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.decorator;

/**
 * @author reus
 * @version $Id: DressUp.java, v 0.1 2018-03-26 reus Exp $
 */
public abstract class DressUp {

    public abstract void dressUp(Person person);

}

class ClothesDressUp extends DressUp {

    @Override
    public void dressUp(Person person) {
        System.out.println(person.getName() + "穿衣服");
    }
}

class TrousersDressUp extends DressUp {

    @Override
    public void dressUp(Person person) {
        System.out.println(person.getName() + "穿裤子");
    }
}

class ShoesDressUp extends DressUp {

    @Override
    public void dressUp(Person person) {
        System.out.println(person.getName() + "穿鞋子");
    }
}