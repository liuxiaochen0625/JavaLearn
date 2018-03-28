/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.jdk;

/**
 * @author reus
 * @version $Id: DBQuery.java, v 0.1 2018-03-28 reus Exp $
 */
public class DBQuery implements IDBQuery{
    @Override
    public String getElement(String id) {
        return id + "_JDKProxy";
    }
}