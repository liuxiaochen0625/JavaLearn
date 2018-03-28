/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author reus
 * @version $Id: DBQueryProxy.java, v 0.1 2018-03-28 reus Exp $
 */
public class DBQueryProxy implements InvocationHandler {

    private DBQuery dbQuery;

    public DBQueryProxy(DBQuery dbQuery) {
        this.dbQuery = dbQuery;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(dbQuery, args);
    }
}