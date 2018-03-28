/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib.lazyload;

import net.sf.cglib.proxy.Dispatcher;

import java.util.Calendar;

/**
 * @author reus
 * @version $Id: ScheduleDispatcher.java, v 0.1 2018-03-28 reus Exp $
 */
public class ScheduleDispatcher implements Dispatcher {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher init...you can query from db...");
        Schedule schedule = new Schedule();
        schedule.setCourseName("Math");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 4, 1);
        schedule.setCourseTime(calendar.getTime());
        System.out.println("after Dispatcher init...");
        return schedule;
    }
}