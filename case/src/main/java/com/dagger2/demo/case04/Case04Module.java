package com.dagger2.demo.case04;


import dagger.Module;
import dagger.Provides;

/**
 * @author JY
 * @Time 2017/12/12 22:15
 */
@Module
public class Case04Module {
    @Provides
    public AddressProducer provideAddress() {
        return new AddressProducer();
    }

}
