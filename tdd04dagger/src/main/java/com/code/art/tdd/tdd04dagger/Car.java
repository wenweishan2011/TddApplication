package com.code.art.tdd.tdd04dagger;

import javax.inject.Inject;

public class Car {
    @Inject
    CarBox carBox;
    @Inject
    Tank tank;
    @Inject
    Tire tire;

    public Car() {
    }

    @Inject
    public Car(CarBox carBox, Tank tank, Tire tire) {
        this.carBox = carBox;
        this.tank = tank;
        this.tire = tire;
    }

    public void print() {
        System.out.println(carBox.toString() + tank.toString() + tire.toString());
    }

    public static void main(String[] args) {

    }

    public static class CarBox {
        public CarBox() {
        }

        @Override
        public String toString() {
            return "CarBox{}";
        }

    }

    public static class Tank {
        public Tank() {
        }

        @Override
        public String toString() {
            return "Tank{}";
        }
    }

    public static class Tire {
        public Tire() {
        }

        @Override
        public String toString() {
            return "Tire{}";
        }
    }
}

