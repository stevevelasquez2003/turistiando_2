package com.example.turistiando_2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audio=MediaPlayer.create(this,R.raw.audio);
        audio.start();

        TimerTask inicio=new TimerTask() {
            @Override
            public void run() {


                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicio,10000);
    }
}
