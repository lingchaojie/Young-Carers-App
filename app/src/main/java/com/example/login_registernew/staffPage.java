package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class staffPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_page);

        //imagebutton for home button
        final ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        //onclick listener for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, UserArea.class);
                startActivity(intent);
                finish();
            }
        });

        //imagebutton for information button
        final Button informationButton = (Button) findViewById(R.id.information);

        //on click listener to link button to information page
        informationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, messagingRules.class);
                startActivity(intent);
            }
        });

        //initialise imageviews
        final CircleImageView staff1 = (CircleImageView) findViewById(R.id.staff1);
        final CircleImageView staff2 = (CircleImageView) findViewById(R.id.staff2);
        final CircleImageView staff3 = (CircleImageView) findViewById(R.id.staff3);
        final CircleImageView staff4 = (CircleImageView) findViewById(R.id.staff4);
        final CircleImageView staff5 = (CircleImageView) findViewById(R.id.staff5);
        final CircleImageView staff6 = (CircleImageView) findViewById(R.id.staff6);
        final CircleImageView staff7 = (CircleImageView) findViewById(R.id.staff7);
        final CircleImageView staff8 = (CircleImageView) findViewById(R.id.staff8);

        //on click listeners for imageviews
        staff1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact1.class);
                startActivity(intent);
            }
        });

        staff2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact2.class);
                startActivity(intent);
            }
        });

        staff3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact3.class);
                startActivity(intent);
            }
        });

        staff4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact4.class);
                startActivity(intent);
            }
        });

        staff5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact5.class);
                startActivity(intent);
            }
        });

        staff6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact6.class);
                startActivity(intent);
            }
        });

        staff7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact7.class);
                startActivity(intent);
            }
        });

        staff8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, staffContact8.class);
                startActivity(intent);
            }
        });
    }



}
