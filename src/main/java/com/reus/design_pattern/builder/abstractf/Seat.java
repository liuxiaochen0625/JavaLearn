package com.reus.design_pattern.builder.abstractf;

/**
 * 座椅
 * @author reus
 * @version $Id: Seat.java, v 0.1 2018-03-16 reus Exp $
 */
public interface Seat {

    void feel();

}

class HighEndSeat implements Seat {
    @Override
    public void feel() {
        System.out.println("高端座椅，坐着舒适");
    }

}

class LowEndSeat implements Seat {
    @Override
    public void feel() {
        System.out.println("低端座椅，坐旧难受");
    }

}