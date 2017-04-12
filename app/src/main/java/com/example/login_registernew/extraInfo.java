package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class extraInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_info);

        //initialise text views
        TextView freeStuff = (TextView) findViewById(R.id.freeStuff);
        TextView places = (TextView) findViewById(R.id.places);

        //initalise button
        TextView carersCentreButton = (TextView) findViewById(R.id.carersCentreButton);

        //make textviews scrollable
        freeStuff.setMovementMethod(new ScrollingMovementMethod());
        places.setMovementMethod(new ScrollingMovementMethod());

        

    }
}
