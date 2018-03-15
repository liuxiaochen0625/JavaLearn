/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.simple;

/**
 * 简单工厂方法
 * @author reus
 * @version $Id: Pizza.java, v 0.1 2018-03-14 reus Exp $
 */
public abstract class Pizza {

    /**
     * 原料
     */
    protected abstract void prepare();

    /**
     * 烘培
     */
    protected abstract void bake();

    /**
     * 切割
     */
    protected abstract void cut();

    /**
     * 打包
     */
    protected abstract void box();

}