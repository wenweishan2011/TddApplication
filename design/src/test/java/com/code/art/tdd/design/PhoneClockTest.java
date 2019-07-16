package com.code.art.tdd.design;

import org.junit.Test;

/**
 * @author wenws
 * @date 2019/7/11.
 * description：
 */
public class PhoneClockTest {

    @Test
    public void testMain(){
        Clock beijing = new CityClock();
        beijing.setLocalTime(10);

        PhoneClock phoneClock = new PhoneClock();
        UtcTime utcTime = new UtcTime();
        utcTime.attach("beijing", beijing);
        utcTime.setUtcTime(10);
        phoneClock.setUtcTime(utcTime);
        phoneClock.setLocalTime(9);
    }

}