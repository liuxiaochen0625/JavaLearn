/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.reflect;

import java.util.Date;

/**
 * 反射的学习
 * @author reus
 * @version $Id: ReflectDemo.java, v 0.1 2018-02-27 reus Exp $
 */
public class ReflectDemo {

    public static void main(String[] args){
        new ReflectDemo().getDemoClass();
    }

    /**
     * 获取java类
     */
    public void getDemoClass(){
        //1.类名.class
        Class<?> cls = Date.class;
        System.out.println(cls);

        //2.对象.getClass()
        cls = new Date().getClass();
        System.out.println(cls);

        //3.用静态方法Class.forName("类名")去得到字符串对应的类字节码
        try {
            cls = Class.forName("java.util.Date");//forName是Class类的静态方法，写类名时一定写出类的全名
            System.out.println(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}