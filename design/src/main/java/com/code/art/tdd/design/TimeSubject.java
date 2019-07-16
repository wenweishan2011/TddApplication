package com.code.art.tdd.design;

import java.util.HashMap;
import java.util.Map;

public abstract class TimeSubject {
    Map<String, Clock> clocks = new HashMap<>();

    public abstract void attach(String name, Clock clock);
    public abstract void detach(String name);

    /**
     *  通知各个时钟
     */
    public abstract void notifyClock();

}
