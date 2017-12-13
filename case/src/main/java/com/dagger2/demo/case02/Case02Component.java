package com.dagger2.demo.case02;


import dagger.Component;

/**
 * @author JY
 * @Time 2017/12/12 16:05
 */

@Component(modules = Case02Module.class)
public interface Case02Component {
    void inject(Case02Activity activity);
}
