/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.facade;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-29 reus Exp $
 */
public class Client {

    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        stockManager.buyStock();
        stockManager.sellStock();
    }

}