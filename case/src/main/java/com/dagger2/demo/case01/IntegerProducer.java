package com.dagger2.demo.case01;

import java.util.Random;

import javax.inject.Inject;

/**
 * @author JY
 * @Time 2017/12/12 16:06
 */

public class IntegerProducer {
    private int num;

    @Inject
    public IntegerProducer() {
        num = new Random().nextInt(9999);
    }

    public int produce() {
        return num;
    }
}
