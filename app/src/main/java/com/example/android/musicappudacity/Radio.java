package com.example.android.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Radio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);


        //Currently playing activity
        //Finds the view that shows a Currently playing activity
        ImageView toCurrentlyPlaying = (ImageView) findViewById(R.id.currently_playing_from_radio);
        //Set a click listener on songs view
        toCurrentlyPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link CurrentlyPlaying}
                Intent toCurrentlyPlayingFromRadioIntent = new Intent(Radio.this, CurrentlyPlaying.class);
                //Starts the new activity
                startActivity(toCurrentlyPlayingFromRadioIntent);
            }
        });


        //Songs activity
        //Finds the view that shows the Songs activity
        ImageView toSongs = (ImageView) findViewById(R.id.songs_activity_from_radio);
        //Set a click listener on songs view
        toSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Songs}
                Intent toSongsFromRadioIntent = new Intent(Radio.this, Songs.class);
                //Starts the new activity
                startActivity(toSongsFromRadioIntent);
            }
        });
        //Albums activity
        //Finds the view that shows the Albums activity
        ImageView toAlbums = (ImageView) findViewById(R.id.albums_activity_from_radio);
        //Set a click listener on songs view
        toAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Albums}
                Intent toAlbumsFromRadioIntent = new Intent(Radio.this, Albums.class);
                //Starts the new activity
                startActivity(toAlbumsFromRadioIntent);
            }
        });
        //Albums activity
        //Finds the view that shows the Albums activity
        final ImageView toMainActivity = (ImageView) findViewById(R.id.main_activity_from_radio);
        //Set a click listener on songs view
        toMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Albums}
                Intent toMainFromRadioIntent = new Intent(Radio.this, MainActivity.class);
                //Starts the new activity
                startActivity(toMainFromRadioIntent);
            }
        });
    }
}
