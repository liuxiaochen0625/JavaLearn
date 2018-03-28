/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author reus
 * @version $Id: TestJDKProxy.java, v 0.1 2018-03-28 reus Exp $
 */
public class TestJDKProxy {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        DBQuery dbQuery = new DBQuery();
        DBQueryProxy dbQueryProxy = new DBQueryProxy(dbQuery);
        IDBQuery query = (IDBQuery) Proxy
                .newProxyInstance(dbQuery.getClass().getClassLoader(), dbQuery.getClass().getInterfaces(),
                        dbQueryProxy);
        System.out.println(query.getElement("Hello"));
    }

}