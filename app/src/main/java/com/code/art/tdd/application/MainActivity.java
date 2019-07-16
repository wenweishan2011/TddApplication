package com.code.art.tdd.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DaggerAppComponent.builder().appModule(new AppModule()).build().inject(this);
//        MainActivity_MembersInjector.create(AppModule_ProvidePresenterFactory.create(new AppModule())).injectMembers(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.print();
    }
}
