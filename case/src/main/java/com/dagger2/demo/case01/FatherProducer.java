package com.dagger2.demo.case01;

import javax.inject.Inject;

/**
 * @author JY
 * @Time 2017/12/12 16:13
 */

public class FatherProducer {
    private IntegerProducer ip;

    @Inject
    public FatherProducer(IntegerProducer ip) {
        this.ip = ip;
    }

    public int produce() {
        return ip.produce();
    }
}
