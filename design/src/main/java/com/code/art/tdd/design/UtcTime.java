package com.code.art.tdd.design;

/**
 * @author wenws
 * @date 2019/7/11.
 * description：
 */
public class UtcTime extends TimeSubject {

    int utcTime;

    public void setUtcTime(int utcTime) {
        this.utcTime = utcTime;
        notifyClock();
    }

    @Override
    public void attach(String name, Clock clock) {
        clocks.put(name, clock);
    }

    @Override
    public void detach(String name) {
        clocks.remove(name);
    }

    @Override
    public void notifyClock() {
        for (Clock clock : clocks.values()) {
            clock.setLocalTime(utcTime);
        }
    }
}
