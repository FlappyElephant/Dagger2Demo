package com.dagger2.demo.case02;

/**
 * @author JY
 * @Time 2017/12/12 17:36
 */

public class ColorPicker {
    private int color;

    public ColorPicker(int color) {
        this.color = color;
    }

    public int pick() {
        return color;
    }
}
