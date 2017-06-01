package com.example.android.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Currently playing activity
        //Finds the view that shows a Currently playing activity
        ImageView toCurrentlyPlaying = (ImageView) findViewById(R.id.currently_playing_from_main);
        //Set a click listener on songs view
        toCurrentlyPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link CurrentlyPlaying}
                Intent toCurrentlyPlayingFromMainIntent = new Intent(MainActivity.this, CurrentlyPlaying.class);
                //Starts the new activity
                startActivity(toCurrentlyPlayingFromMainIntent);
            }
        });


        //Songs activity
        //Finds the view that shows the Songs activity
        ImageView toSongs = (ImageView) findViewById(R.id.songs_activity_from_main);
        //Set a click listener on songs view
        toSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Songs}
                Intent toSongsFromMainIntent = new Intent(MainActivity.this, Songs.class);
                //Starts the new activity
                startActivity(toSongsFromMainIntent);
            }
        });
        //Albums activity
        //Finds the view that shows the Albums activity
        ImageView toAlbums = (ImageView) findViewById(R.id.albums_activity_from_main);
        //Set a click listener on songs view
        toAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Albums}
                Intent toAlbumsFromMainIntent = new Intent(MainActivity.this, Albums.class);
                //Starts the new activity
                startActivity(toAlbumsFromMainIntent);
            }
        });
        //Radio activity
        //Finds the view that shows the Radio activity
        ImageView toRadio = (ImageView) findViewById(R.id.radio_activity_from_main);
        //Set a click listener on radio view
        toRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a new intent to open the{@ link Radio}
                Intent toRadioFromMainIntent = new Intent(MainActivity.this, Radio.class);
                //Starts the new activity
                startActivity(toRadioFromMainIntent);
            }
        });
    }
}
