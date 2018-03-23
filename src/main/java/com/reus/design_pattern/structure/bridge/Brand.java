package com.reus.design_pattern.structure.bridge;

/**
 * @author reus
 * @version $Id: Brand.java, v 0.1 2018-03-23 reus Exp $
 */
public interface Brand {

    void info();

}

class LenovoBrand implements Brand {

    @Override
    public void info() {
        System.out.println("联想");
    }
}

class AsusBrand implements Brand {

    @Override
    public void info() {
        System.out.println("华硕");
    }
}
