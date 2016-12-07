package com.example.alvaro.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread hilo= new Thread()
        {

            @Override
            public void run() {
                try {
                    sleep(3000);
                  Intent uno= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(uno);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        hilo.start();
    }
}
