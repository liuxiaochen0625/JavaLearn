/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.bridge;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-23 reus Exp $
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Desktop(new LenovoBrand());
        computer.info();
    }

}