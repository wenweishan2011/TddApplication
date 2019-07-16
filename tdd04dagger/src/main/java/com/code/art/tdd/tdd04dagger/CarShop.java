package com.code.art.tdd.tdd04dagger;

import dagger.Component;

@Component(modules = CarModule.class)
interface CarShopComponent {
    Car make();
}
