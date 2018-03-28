/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus;

import javax.script.ScriptException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author reus
 * @version $Id: Test.java, v 0.1 2018-03-14 reus Exp $
 */
public class Test {

    public static void main(String[] args) throws ScriptException, NoSuchMethodException {

        HashSet<?> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        printSet(s1);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }

    public static void printSet(Set<?> s) {
        for (Object o : s) {
            System.out.println(o);
        }
    }

}