package com.dagger2.demo.case02;

import android.graphics.Color;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author JY
 * @Time 2017/12/12 17:33
 */

@Module
public class Case02Module {

    @Provides
    @Named("green")
    public ColorPicker provideColorGreen() {
        return new ColorPicker(Color.GREEN);
    }

    @Provides
    @Named("blue")
    public ColorPicker provideColorBlue() {
        return new ColorPicker(Color.BLUE);
    }

}
