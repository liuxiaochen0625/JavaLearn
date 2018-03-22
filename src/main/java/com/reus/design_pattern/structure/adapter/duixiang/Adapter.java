/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.adapter.duixiang;

/**
 * @author reus
 * @version $Id: Adapter.java, v 0.1 2018-03-22 reus Exp $
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类有方法simpleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }

    /**
     * 源类没有方法simpleOperation2
     * 因此适配器类补充上这个方法
     */
    @Override
    public void simpleOperation2() {

    }
}