/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.simple;

/**
 * @author reus
 * @version $Id: CheesePizza.java, v 0.1 2018-03-14 reus Exp $
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza~");
    }

    @Override
    public void bake() {
        System.out.println("正在烘培CheesePizza~");
    }

    @Override
    public void cut() {
        System.out.println("正在切割CheesePizza~");
    }

    @Override
    public void box() {
        System.out.println("正在打包CheesePizza~");
    }
}