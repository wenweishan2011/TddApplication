package com.code.art.tdd.tdd01;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
class PhoneClock extends Clock {
    private HotelClockSystem hotelClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if(hotelClockSystem == null){
            return;
        }
        for(CityClock clock : hotelClockSystem.getClocks()){
            clock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelClockSystem(HotelClockSystem hotelClockSystem) {
        this.hotelClockSystem = hotelClockSystem;
    }

    @Override
    public int getTime() {
        return this.time;
    }
}
