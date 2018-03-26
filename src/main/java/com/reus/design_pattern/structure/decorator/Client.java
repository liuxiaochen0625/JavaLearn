/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.structure.decorator;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-26 reus Exp $
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("小白");

        DressUp du1 = new ClothesDressUp();
        du1.dressUp(person);

        DressUp du2 = new TrousersDressUp();
        du2.dressUp(person);

        DressUp du3 = new ShoesDressUp();
        du3.dressUp(person);
    }

}