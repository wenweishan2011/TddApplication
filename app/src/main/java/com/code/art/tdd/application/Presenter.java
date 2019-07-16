package com.code.art.tdd.application;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * @author wenws
 * @date 2019/7/15.
 * description：
 */
public class Presenter {

    public Presenter() {
        Log.e("wws", "presenter cons");
    }


    public void print(){
        Log.e("wws", "print");
    }
}
