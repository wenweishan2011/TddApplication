package com.code.art.tdd.tdd01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
class HotelClockSystem {
    private List<CityClock> clocks = new ArrayList<>();

    public void attachClock(CityClock cityClock) {
        clocks.add(cityClock);
    }

    public List<CityClock> getClocks() {
        return this.clocks;
    }
}
