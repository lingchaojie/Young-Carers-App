package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        //initialise feedback button
        Button feedbackButton = (Button) findViewById(R.id.feedback);
    }
}
