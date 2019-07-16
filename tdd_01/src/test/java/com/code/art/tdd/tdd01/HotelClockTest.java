package com.code.art.tdd.tdd01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
public class HotelClockTest {
    PhoneClock phoneClock;
    HotelClockSystem hotelClockSystem;

    @Before
    public void initialize(){
        phoneClock = new PhoneClock(8);
        hotelClockSystem = new HotelClockSystem();
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time(){

        //Arrange 测试前准备工作
        CityClock londonClock = new CityClock(0);
        //Act
        hotelClockSystem.attachClock(londonClock);
        phoneClock.setHotelClockSystem(hotelClockSystem);
        phoneClock.setTime(9);
        //Assert 验证结果
        assertEquals(1, londonClock.getTime());
    }

    //eg. 时间负数情况: 纽约
    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time(){

        //Arrange
        CityClock newYorkClock = new CityClock(-5);
        //Act
        hotelClockSystem.attachClock(newYorkClock);
        phoneClock.setHotelClockSystem(hotelClockSystem);
        phoneClock.setTime(9);
        //Assert
        assertEquals(20, newYorkClock.getTime());
    }

    //同时设置其他城市
    @Test
    public void the_time_of_Clock_London_and_NewYork_should_be_1_and_20_after_phone_clock_set_9_Beijing_time(){
        //Arrange
        PhoneClock phoneClock = new PhoneClock(8);
        CityClock londonClock = new CityClock(0);
        CityClock newYorkClock = new CityClock(-5);
        HotelClockSystem hotelClockSystem = new HotelClockSystem();
        //Act
        hotelClockSystem.attachClock(londonClock);
        hotelClockSystem.attachClock(newYorkClock);
        phoneClock.setHotelClockSystem(hotelClockSystem);
        phoneClock.setTime(9);
        //Assert
        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkClock.getTime());
    }

    //测试自身手机设置时间
    @Test
    public void the_time_of_the_phone_clock_should_be_set_currently_after_its_setTime(){
        //arrange
        PhoneClock phoneClock = new PhoneClock(8);
        //act
        phoneClock.setTime(9);
        //assert
        assertEquals(9, phoneClock.getTime());
    }

}