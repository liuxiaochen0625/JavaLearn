package com.reus.design_pattern.builder.abstractf;

/**
 * 引擎
 * @author reus
 * @version $Id: Engine.java, v 0.1 2018-03-16 reus Exp $
 */
public interface Engine {

    void run();

}

class HighEndEngine implements Engine {
    @Override
    public void run() {
        System.out.println("高端发动机，启动快");
    }

}

class LowEndEngine implements Engine {
    @Override
    public void run() {
        System.out.println("低端发动机，启动慢");
    }
}
