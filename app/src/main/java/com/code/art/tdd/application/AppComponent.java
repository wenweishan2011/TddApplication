package com.code.art.tdd.application;

import dagger.Component;

/**
 * @author wenws
 * @date 2019/7/15.
 * description：
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
