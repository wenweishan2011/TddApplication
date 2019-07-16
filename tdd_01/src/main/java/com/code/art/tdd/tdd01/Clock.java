package com.code.art.tdd.tdd01;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
abstract class Clock {
    protected int utcOffset;

    public abstract int getTime();

}
