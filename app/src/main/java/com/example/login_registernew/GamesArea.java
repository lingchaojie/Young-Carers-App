package com.example.login_registernew;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
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

        //imagebuttons for games icons
        final ImageButton fluidMonkey = (ImageButton) findViewById(R.id.game1);
        final ImageButton puzzlerama = (ImageButton) findViewById(R.id.game2);
        final ImageButton light = (ImageButton) findViewById(R.id.game3);
        final ImageButton brainItOn = (ImageButton) findViewById(R.id.game4);
        final ImageButton blendoku = (ImageButton) findViewById(R.id.game5);
        final ImageButton infinityLoop = (ImageButton) findViewById(R.id.game6);
        final ImageButton innergarden = (ImageButton) findViewById(R.id.game7);
        final ImageButton hook = (ImageButton) findViewById(R.id.game8);
        final ImageButton pottery = (ImageButton) findViewById(R.id.game9);
        final ImageButton brainYoga = (ImageButton) findViewById(R.id.game10);
        final ImageButton mandala = (ImageButton) findViewById(R.id.game11);
        final ImageButton hue = (ImageButton) findViewById(R.id.game12);
        final ImageButton stack = (ImageButton) findViewById(R.id.game13);
        final ImageButton polyforge = (ImageButton) findViewById(R.id.game14);
        final ImageButton colorzen = (ImageButton) findViewById(R.id.game15);
        final ImageButton outfolded = (ImageButton) findViewById(R.id.game16);

        //onlick listeners for games buttons - links to google play store

        fluidMonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.buzzmonkey.FluidMonkey"));
                startActivity(intent);
            }
        });

        puzzlerama.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.leodesol.games.puzzlecollection"));
                startActivity(intent);
            }
        });

        light.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nicoteam.light"));
                startActivity(intent);
            }
        });

        blendoku.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.lonelyfew.blendoku2"));
                startActivity(intent);
            }
        });

        infinityLoop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.balysv.loop"));
                startActivity(intent);
            }
        });

        brainItOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.orbital.brainiton"));
                startActivity(intent);
            }
        });

        brainYoga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.megafaunasoft.brainyoga"));
                startActivity(intent);
            }
        });

        pottery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=pl.idreams.potterylite"));
                startActivity(intent);
            }
        });

        polyforge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.impactbluestudios.polyforge"));
                startActivity(intent);
            }
        });

        stack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ketchapp.stack"));
                startActivity(intent);
            }
        });

        colorzen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.largeanimal.colorzen"));
                startActivity(intent);
            }
        });

        mandala.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.eyewind.colorfit.mandala"));
                startActivity(intent);
            }
        });

        outfolded.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.threesprockets.outfolded"));
                startActivity(intent);
            }
        });

        hook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rt.hook"));
                startActivity(intent);
            }
        });

        hue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.zutgames.ilovehue"));
                startActivity(intent);
            }
        });

        innergarden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dustflake.innergarden"));
                startActivity(intent);
            }
        });

    }

}
