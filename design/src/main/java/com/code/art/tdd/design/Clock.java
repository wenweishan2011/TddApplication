package com.code.art.tdd.design;

/**
 * @author wenws
 * @date 2019/7/11.
 * description：
 */
abstract class Clock {
    int utcOffset = 0;
    int localTime = 0;
    abstract void setLocalTime(int time);
}
