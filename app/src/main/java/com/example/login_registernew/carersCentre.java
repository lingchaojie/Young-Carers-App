package com.example.login_registernew;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class carersCentre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carers_centre);

        //initialise text views
        TextView Services = (TextView) findViewById(R.id.services);
        TextView Definition = (TextView) findViewById(R.id.definition);
        TextView Events = (TextView) findViewById(R.id.events);

        //initialise imagebuttons
        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);
        ImageButton contactDetailsButton = (ImageButton) findViewById(R.id.contactDetailsButton);

        //onclick listeners for imagebuttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(carersCentre.this, UserArea.class);
                startActivity(intent);
                finish();
            }
        });

        contactDetailsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(carersCentre.this, carersCentreContact.class);
                startActivity(intent);
            }
        });

        //initialise feedback button
        Button feedbackButton = (Button) findViewById(R.id.feedback);

        //on click listener for feedback button
        feedbackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(new Intent(Intent.ACTION_VIEW, Uri.parse("http://sunderlandcarers.co.uk/consultations.html")));
                startActivity(intent);
            }
        });
    }
}
