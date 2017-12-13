package com.dagger2.demo.case05;



import javax.inject.Singleton;

import dagger.Component;

/**
 * @author JY
 * @Time 2017/12/12 18:52
 */
@Component(modules = Case05Module.class)
@Singleton
public interface Case05Component {

    void inject(Case05Activity activity);

    void inject(Case051Activity activity);

    void inject(Case052Activity activity);

    void inject(Case053Activity activity);
}
