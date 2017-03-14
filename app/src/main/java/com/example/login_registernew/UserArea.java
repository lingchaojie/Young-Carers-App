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


        final ImageButton carersCentreButton = (ImageButton) findViewById(R.id.carerscentre);
        final ImageButton parentsguardiansButton = (ImageButton) findViewById(R.id.parentsguardians);

        //ImageButton for coping mechanisms icon
        final ImageButton copingMechanismsButton = (ImageButton) findViewById(R.id.copingMechanisms);

        //on click listener to link button to coping mechanisms page
        copingMechanismsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, CopingMechanisms.class);
                startActivity(intent);
            }
        });

        final ImageButton calendarButton = (ImageButton) findViewById(R.id.calendar);
        final ImageButton staffButton = (ImageButton) findViewById(R.id.staff);

        final ImageButton gamesButton = (ImageButton) findViewById(R.id.games);

        //on click listener to link button to games page
        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, GamesArea.class);
                startActivity(intent);
            }
        });

        final ImageButton vlogsButton = (ImageButton) findViewById(R.id.vlogs);

        final ImageButton recipesButton = (ImageButton) findViewById(R.id.recipes);

        //on click listener to link button to recipes page
        recipesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(UserArea.this, Recipes.class);
                startActivity(intent);
            }
        });

        final ImageButton profileButton = (ImageButton) findViewById(R.id.profile);

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
