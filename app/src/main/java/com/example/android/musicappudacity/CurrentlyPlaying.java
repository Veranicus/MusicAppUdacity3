package com.example.android.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrentlyPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        final ImageView backFromCurrentlyPlaying = (ImageView) findViewById(R.id.back_from_currently_playing_activity);
        //Intent to send user back to previous activity when clicked the back button
        backFromCurrentlyPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }
}

