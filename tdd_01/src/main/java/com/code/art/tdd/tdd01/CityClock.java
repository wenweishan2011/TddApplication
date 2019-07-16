package com.code.art.tdd.tdd01;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
class CityClock extends Clock {
    /**
     * utc时间
     */
    private int utcZeroTime;

    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    @Override
    public int getTime() {
        return (this.utcZeroTime + super.utcOffset + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
