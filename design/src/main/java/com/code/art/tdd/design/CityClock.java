package com.code.art.tdd.design;

/**
 * @author wenws
 * @date 2019/7/11.
 * description：
 */
public class CityClock extends Clock {
    @Override
    void setLocalTime(int time) {
        this.localTime = time;
    }
}
