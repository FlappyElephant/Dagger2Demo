package com.dagger2.demo.case06;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author JY
 * @Time 2017/12/12 19:26
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface address {
}
