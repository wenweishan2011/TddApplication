package com.code.art.tdd.design;

/**
 * @author wenws
 * @date 2019/7/11.
 * description：
 */
public class PhoneClock extends Clock {
    UtcTime utcTime;

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }

    @Override
    public void setLocalTime(int local) {
        localTime = local;
        utcTime.setUtcTime(localTime - utcOffset);
    }
}
