package com.dagger2.demo.case01;

import javax.inject.Inject;

/**
 * @author JY
 * @Time 2017/12/12 16:47
 */

public class OtherProducer {
//    @Inject
    public IntegerProducer get() {
        return new IntegerProducer();
    }
}
