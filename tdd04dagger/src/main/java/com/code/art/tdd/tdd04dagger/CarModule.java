package com.code.art.tdd.tdd04dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {
    @Provides
     Car.Tire privderTire() {
        return new Car.Tire();
    }

    @Provides
     Car.Tank privderTank() {
        return new Car.Tank();
    }

    @Provides
     Car.CarBox privderCarBox() {
        return new Car.CarBox();
    }

/*    @Provides
    static Car privderCar() {
        return new Car();
    }*/
}