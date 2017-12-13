package com.dagger2.demo.case04;



import dagger.Component;

/**
 * @author JY
 * @Time 2017/12/12 18:52
 */
@Component(modules = Case04Module.class)
public interface Case04Component {
    void inject(Case04Activity activity);
}
