/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author reus
 * @version $Id: Client.java, v 0.1 2018-03-27 reus Exp $
 */
public class Client {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "target/classes");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);//继承被代理类
        enhancer.setCallback(new HelloMethodInterceptor());//设置回调
        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();//生成代理对象
        helloService.sayHello();//在调用代理类中的方法时，会被我们实现的方法拦截器拦截
        System.out.println("我们得到的bean是：" + helloService.getClass());
        System.out.println("实际调用者的父类：" + helloService.getClass().getSuperclass());
        try {
            Class<?> c = Class
                .forName("com.reus.proxy.cglib.HelloServiceImpl$$EnhancerByCGLIB$$b7ce0814");
            Class<?> beanc = Class.forName("com.reus.proxy.cglib.HelloServiceImpl");

            Method[] beanc_method = beanc.getMethods();
            int i = 1;
            System.out.println("原始的bean的方法总共" + beanc_method.length + "个");
            for (Method method : beanc_method) {

                System.out.println("原始的bean方法" + i++ + method.getName());

            }

            i = 1;
            Method[] methods = c.getMethods();
            System.out.println("我们得到的bean的方法总共" + methods.length + "个");
            for (Method method : methods) {
                System.out.println("我们得到的bean的方法" + i++ + method.getName());
            }
            System.out.println("原始的bean的父类：" + beanc.getSuperclass());
            System.out.println("我们得到的bean的父类：" + c.getSuperclass());

            Field[] bean_fields = beanc.getDeclaredFields();
            i = 1;

            for (Field field : bean_fields) {
                System.out.println("原始bean的属性 " + i++ + field);
            }

            Field[] fields = c.getDeclaredFields();
            i = 1;
            for (Field field : fields) {
                System.out.println("我们得到的bean的属性 " + i++ + field);
            }
//            Class proxyGenerator = Class.forName("sun.misc.ProxyGenerator");
//            Method[] methods2 = proxyGenerator.getMethods();
//            for (Method method : methods2) {
//                System.out.println(method);
//                byte[] TempProxySuper = (byte[]) method.invoke(proxyGenerator, "TempProxySuper",
//                    new Class[] { c.getSuperclass() });
//                byte[] TempProxy = (byte[]) method.invoke(proxyGenerator, "TempProxy",
//                    new Class[] { c });
//                byte[] TempBean = (byte[]) method.invoke(proxyGenerator, "TempBean",
//                    new Class[] { beanc });
//                createClassFile("TempProxy", TempProxy);
//                createClassFile("TempProxySuper", TempProxySuper);
//                createClassFile("TempBean", TempBean);
//                break;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createClassFile(String fileName, byte[] classFile) {
        try {
            File file;
            FileOutputStream fos = new FileOutputStream(file = new File(fileName + ".class"));
            fos.write(classFile);
            fos.flush();
            fos.close();
            System.out.println(file.getAbsolutePath());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}