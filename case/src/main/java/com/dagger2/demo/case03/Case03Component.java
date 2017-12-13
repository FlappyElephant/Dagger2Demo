package com.dagger2.demo.case03;

import dagger.Component;

/**
 * @author JY
 * @Time 2017/12/12 18:36
 */
@Content @Color
@Component(modules = Case03Module.class)
public interface Case03Component {
    void inject(Case03Activity activity);
}
