package com.example.login_registernew;

import android.content.Intent;
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
    }
}
