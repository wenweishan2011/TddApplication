package com.code.art.tdd.application;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author wenws
 * @date 2019/7/15.
 * description：
 */

@Module
public class AppModule {

    @Provides
    Presenter providePresenter(){
        return new Presenter();
    }
}
