package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class helpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

        //initialise text views
        TextView Q1 = (TextView) findViewById(R.id.Q1);
        TextView Q1A = (TextView) findViewById(R.id.Q1A);
        TextView Q2 = (TextView) findViewById(R.id.Q2);
        TextView Q2A = (TextView) findViewById(R.id.Q2A);
        TextView Q3 = (TextView) findViewById(R.id.Q3);
        TextView Q3A = (TextView) findViewById(R.id.Q3A);

        //initialise image views
        ImageView Q1Icon = (ImageView) findViewById(R.id.Q1Icon);
        ImageView Q2Icon = (ImageView) findViewById(R.id.Q2Icon);
        ImageView Q3Icon = (ImageView) findViewById(R.id.Q3Icon);

        //initialise licenses button
        Button Licenses = (Button) findViewById(R.id.LicensesButton);

    }
}