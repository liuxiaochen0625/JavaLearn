/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.facade;

/**
 * @author reus
 * @version $Id: StockManager.java, v 0.1 2018-03-29 reus Exp $
 */
public class StockManager {

    private StockA stockA;

    private StockB stockB;

    public StockManager() {
        stockA = new StockA();
        stockB = new StockB();
    }

    public void buyStock() {
        this.stockA.buy();
        this.stockB.buy();
    }

    public void sellStock() {
        this.stockA.sell();
        this.stockB.sell();
    }

}