package com.dagger2.demo.case03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author JY
 * @Time 2017/12/12 18:17
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Color {
}
