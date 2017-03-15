package com.example.login_registernew;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CopingMechanisms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coping_mechanisms);

        //ImageButton for home button
        final ImageButton homeButton =  (ImageButton) findViewById(R.id.homeButton);

        //on click listener to take user back to home screen when home button is clicked
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, UserArea.class);
                startActivity(intent);
            }
        });

        //ImageButton for weblinks button
        final ImageButton weblinkButton = (ImageButton) findViewById(R.id.weblinks);

        //on click listener to show relevent web links pop up
        weblinkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CopingMechanisms.this, copingWebLinks.class);
                startActivity(intent);
            }
        });

        //ImageButton for information button
        final ImageButton informationButton = (ImageButton) findViewById(R.id.information);

        //on click listener to show information pop up
        informationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CopingMechanisms.this, copingMechanismsInfo.class);
                startActivity(intent);
            }
        });

        //ImageButtons for 5 coping mechanism pop-ups
        final ImageButton takeTimeButton = (ImageButton) findViewById(R.id.takeTime);
        final ImageButton hobbyButton = (ImageButton) findViewById(R.id.hobby);
        final ImageButton stayHealthyButton = (ImageButton) findViewById(R.id.stayHealthy);
        final ImageButton financeButton = (ImageButton) findViewById(R.id.finance);
        final ImageButton getOrganisedButton = (ImageButton) findViewById(R.id.getOrganised);

        //on click listeners for coping mechanisms buttons
        takeTimeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, takeTimePopUp.class);
                startActivity(intent);
            }
        });

        hobbyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, hobbyPopUp.class);
                startActivity(intent);
            }
        });

        stayHealthyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, stayHealthyPopUp.class);
                startActivity(intent);
            }
        });

        financeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, financePopUp.class);
                startActivity(intent);
            }
        });

        getOrganisedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(CopingMechanisms.this, getOrganisedPopUp.class);
                startActivity(intent);
            }
        });
    }
}
