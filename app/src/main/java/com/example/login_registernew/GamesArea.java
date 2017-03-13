package com.example.login_registernew;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class GamesArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_area);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //imagebutton for home button
        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        //onclick listener for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(GamesArea.this, UserArea.class);
                startActivity(intent);
            }
        });

        //imagebutton for info button
        ImageButton informationButton = (ImageButton)  findViewById(R.id.information);

        //onclick listener for info button
        informationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(GamesArea.this, GamesAreaInfo.class);
                startActivity(intent);
            }
        });
    }

}
