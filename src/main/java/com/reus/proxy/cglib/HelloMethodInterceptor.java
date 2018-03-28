/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author reus
 * @version $Id: HelloMethodInterceptor.java, v 0.1 2018-03-27 reus Exp $
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("Before" + ":" + method.getName());
        System.out.println("实际调用者是： " + obj.getClass());
        for (Object o : args) {
            System.out.println("方法参数类型为：" + o.getClass());
        }

        Object object = proxy.invokeSuper(obj, args);
        System.out.println("After" + ":" + method.getName());
        return object;
    }
}