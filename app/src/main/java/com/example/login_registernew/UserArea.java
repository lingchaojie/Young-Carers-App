package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class UserArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        //ImageButton for carers centre icon
        final ImageButton carersCentreButton = (ImageButton) findViewById(R.id.carerscentre);

        //onclick listener to link icon to carers centre page
        carersCentreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, carersCentre.class);
                startActivity(intent);
            }
        });

        final ImageButton parentsguardiansButton = (ImageButton) findViewById(R.id.parentsguardians);

        //on click listener to link button to parents & guardians page
        parentsguardiansButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, parentsGuardians.class);
                startActivity(intent);
            }
        });

        //ImageButton for coping mechanisms icon
        final ImageButton copingMechanismsButton = (ImageButton) findViewById(R.id.copingMechanisms);

        //on click listener to link button to coping mechanisms page
        copingMechanismsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, CopingMechanisms.class);
                startActivity(intent);
            }
        });

        //imagebutton for calendar icon
        final ImageButton calendarButton = (ImageButton) findViewById(R.id.calendar);

        //on click listener to link button to calendar page
        calendarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, CalendarPage.class);
                startActivity(intent);
            }
        });

        //image button for staff icon
        final ImageButton staffButton = (ImageButton) findViewById(R.id.staff);

        //on click listener to link button to staff page
        staffButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, staffPage.class);
                startActivity(intent);
            }
        });

        //image button for games icon
        final ImageButton gamesButton = (ImageButton) findViewById(R.id.games);

        //on click listener to link button to games page
        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, GamesArea.class);
                startActivity(intent);
            }
        });

        //image button for vlogs icon
        final ImageButton vlogsButton = (ImageButton) findViewById(R.id.vlogs);

        //image button for recipes icon
        final ImageButton recipesButton = (ImageButton) findViewById(R.id.recipes);

        //on click listener to link button to recipes page
        recipesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, Recipes.class);
                startActivity(intent);
            }
        });

        //image button for profile icon
        final ImageButton profileButton = (ImageButton) findViewById(R.id.profile);

        //image button for extra info icon
        final ImageButton extraInfoButton = (ImageButton) findViewById(R.id.extrainfo);

        //on click listener for extra info page
        extraInfoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, extraInfo.class);
                startActivity(intent);
            }
        });

        //image button for help icon
        final ImageButton helpButton = (ImageButton) findViewById(R.id.helpButton);

        //on click listener for help page

        helpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, helpPage.class);
                startActivity(intent);
            }
        });

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuinflater = getMenuInflater();
        mMenuinflater.inflate(R.menu.area_menu,menu);
        return true;
    }
}
