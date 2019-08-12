package com.small.testing;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExitActivity extends AppCompatActivity {
    Button img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);


        img1 = (Button) findViewById(R.id.but1);
        img2 = (Button) findViewById(R.id.but2);
        img3 = (Button) findViewById(R.id.but3);
        img4 = (Button) findViewById(R.id.but4);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.pipis_indo);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.pipis_jawa);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.ee_indo);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.ee_jawa);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });

    }
}