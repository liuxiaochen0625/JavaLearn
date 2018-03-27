/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-27 reus Exp $
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);//继承被代理类
        enhancer.setCallback(new HelloMethodInterceptor());//设置回调
        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();//生成代理对象
        helloService.sayHello();//在调用代理类中的方法时，会被我们实现的方法拦截器拦截
    }
}