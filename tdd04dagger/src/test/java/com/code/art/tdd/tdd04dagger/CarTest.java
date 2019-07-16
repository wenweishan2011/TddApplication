package com.code.art.tdd.tdd04dagger;

import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class CarTest {
    @Inject
    Car car;
    @Test
    public void print() {
        car.print();
    }
}