package com.dagger2.demo.case06;

import com.dagger2.demo.case04.AddressProducer;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author JY
 * @Time 2017/12/12 22:15
 */
@Module
public class Case06Module {
    @Provides
    @address
    public AddressProducer provideAddress() {
        return new AddressProducer();
    }

}
