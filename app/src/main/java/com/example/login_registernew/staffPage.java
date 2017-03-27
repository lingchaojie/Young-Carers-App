package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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
        final ImageButton informationButton = (ImageButton) findViewById(R.id.information);

        //on click listener to link button to information page
        informationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(staffPage.this, messagingRules.class);
                startActivity(intent);
            }
        });
    }
}
