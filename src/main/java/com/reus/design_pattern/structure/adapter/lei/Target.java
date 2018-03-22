package com.reus.design_pattern.structure.adapter.lei;

/**
 * @author reus
 * @version $Id: Target.java, v 0.1 2018-03-22 reus Exp $
 */
public interface Target {

    /**
     * 这是源类也有的方法simpleOperation1
     */
    void simpleOperation1();

    /**
     * 这是源类没有的方法simpleOperation2
     */
    void simpleOperation2();

}
