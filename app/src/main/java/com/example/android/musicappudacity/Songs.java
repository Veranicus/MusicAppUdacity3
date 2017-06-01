package com.example.android.musicappudacity;

import android.app.Activity;
import android.content.Intent;
import android.database.CursorIndexOutOfBoundsException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Currently playing activity
        //Finds the view that shows a Currently playing activity
        ImageView toCurrentlyPlaying = (ImageView) findViewById(R.id.currently_playing_from_radio);
        //Set a click listener on songs view
        toCurrentlyPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link CurrentlyPlaying}
                Intent toCurrentlyPlayingFromSongsIntent = new Intent(Songs.this, CurrentlyPlaying.class);
                //Starts the new activity
                startActivity(toCurrentlyPlayingFromSongsIntent);
            }
        });


        //Songs activity
        //Finds the view that shows the Radio activity
        ImageView toRadio = (ImageView) findViewById(R.id.radio_activity_from_songs);
        //Set a click listener on radio view
        toRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Radio}
                Intent toRadioFromSongsIntent = new Intent(Songs.this, Radio.class);
                //Starts the new activity
                startActivity(toRadioFromSongsIntent);
            }
        });
        //Albums activity
        //Finds the view that shows the Albums activity
        ImageView toAlbums = (ImageView) findViewById(R.id.albums_activity_from_songs);
        //Set a click listener on songs view
        toAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Albums}
                Intent toAlbumsFromSongsIntent = new Intent(Songs.this, Albums.class);
                //Starts the new activity
                startActivity(toAlbumsFromSongsIntent);
            }
        });
        //Main activity
        //Finds the view that shows the Main activity
        final ImageView toMainActivity = (ImageView) findViewById(R.id.main_activity_from_songs);
        //Set a click listener on songs view
        toMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link MainActivity}
                Intent toMainFromSongsIntent = new Intent(Songs.this, MainActivity.class);
                //Starts the new activity
                startActivity(toMainFromSongsIntent);
            }
        });


    }
}



