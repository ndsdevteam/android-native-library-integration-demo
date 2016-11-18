package com.nds.androidnativeintegrationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hk.redpages.servicetab.ServiceTabCallback;
import hk.redpages.servicetab.ServiceTabLibrary;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_go_lib).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(MainActivity.this, com.nds.nativelibrary.MainActivity.class);
                startActivity(intent);*/
                ServiceTabLibrary.getInstance().setup(getApplicationContext(), new ServiceTabCallback() {
                    @Override
                    public void onMotherLodeDeepLinkClicked(String link) {

                    }
                }).init();
                /*Intent intent = new Intent(getApplicationContext(), hk.redpages.servicetab.activity.MainActivity.class);
                startActivity(intent);*/
            }
        });
    }
}
