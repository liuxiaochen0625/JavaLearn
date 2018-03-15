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
    public abstract void prepare();

    /**
     * 烘培
     */
    public abstract void bake();

    /**
     * 切割
     */
    public abstract void cut();

    /**
     * 打包
     */
    public abstract void box();

}