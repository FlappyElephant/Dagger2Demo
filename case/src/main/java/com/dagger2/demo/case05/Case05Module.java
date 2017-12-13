package com.dagger2.demo.case05;

import com.dagger2.demo.case04.AddressProducer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author JY
 * @Time 2017/12/12 22:15
 */
@Module
public class Case05Module {
    @Provides
    @Singleton
    public AddressProducer provideAddress() {
        return new AddressProducer();
    }

}
