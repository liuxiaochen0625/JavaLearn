/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.simple;

/**
 * @author reus
 * @version $Id: GreekPizza.java, v 0.1 2018-03-14 reus Exp $
 */
public class GreekPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("准备GreekPizza~");
    }

    @Override
    protected void bake() {
        System.out.println("正在烘培GreekPizza~");
    }

    @Override
    protected void cut() {
        System.out.println("正在切割GreekPizza~");
    }

    @Override
    protected void box() {
        System.out.println("正在打包GreekPizza~");
    }
}