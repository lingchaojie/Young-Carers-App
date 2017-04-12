package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class extraInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_info);

        //initialise text views
        TextView freeStuff = (TextView) findViewById(R.id.freeStuff);
        TextView places = (TextView) findViewById(R.id.places);

        //make textviews scrollable
        freeStuff.setMovementMethod(new ScrollingMovementMethod());
        places.setMovementMethod(new ScrollingMovementMethod());

        //initalise button
        TextView carersCentreButton = (TextView) findViewById(R.id.carersCentreButton);

        //on click listener for carers centre button
        carersCentreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(extraInfo.this, carersCentre.class);
                startActivity(intent);
                finish();
            }
        });
        
        //initialise home button
        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        //onclick listeners for imagebuttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(extraInfo.this, UserArea.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
