/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib.lazyload;

import net.sf.cglib.proxy.LazyLoader;

import java.util.Calendar;

/**
 * @author reus
 * @version $Id: ScheduleLazyLoader.java, v 0.1 2018-03-28 reus Exp $
 */

public class ScheduleLazyLoader implements LazyLoader {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("before LazyLoader init...you can query from db...");
        Schedule schedule = new Schedule();
        schedule.setCourseName("English");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 3, 28);
        schedule.setCourseTime(calendar.getTime());
        System.out.println("after LazyLoader init...");
        return schedule;
    }
}