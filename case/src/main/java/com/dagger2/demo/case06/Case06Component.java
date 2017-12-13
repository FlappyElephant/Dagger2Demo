package com.dagger2.demo.case06;


import dagger.Component;

/**
 * @author JY
 * @Time 2017/12/12 18:52
 */
@Component(modules = Case06Module.class)
@address
public interface Case06Component {
    void inject(Case06Activity activity);

    void inject(Case061Activity activity);


}
