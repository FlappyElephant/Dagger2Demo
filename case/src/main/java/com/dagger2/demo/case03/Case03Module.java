package com.dagger2.demo.case03;

import com.dagger2.demo.case01.IntegerProducer;
import com.dagger2.demo.case02.ColorPicker;

import dagger.Module;
import dagger.Provides;

/**
 * @author JY
 * @Time 2017/12/12 18:37
 */
@Module
public class Case03Module {

    @Content
    @Provides
    public IntegerProducer produceNum() {
        return new IntegerProducer();
    }

    @Color
    @Provides
    public ColorPicker produceColor() {
        return new ColorPicker(android.graphics.Color.RED);
    }
}
