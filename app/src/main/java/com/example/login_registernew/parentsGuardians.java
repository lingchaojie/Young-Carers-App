package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class parentsGuardians extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_guardians);

        //initialise text views
        TextView ToDo = (TextView) findViewById(R.id.todo);
        TextView supportCentre = (TextView) findViewById(R.id.supportCentre);
        TextView supportCarer = (TextView) findViewById(R.id.supportCarer);

        //add title text to information textviews
        ToDo.setText("To-do");
        supportCentre.setText("How you can support the carers centre");
        supportCarer.setText("How to support a young carer in your life");

        //make textviews scrollable
        ToDo.setMovementMethod(new ScrollingMovementMethod());
        supportCentre.setMovementMethod(new ScrollingMovementMethod());
        supportCarer.setMovementMethod(new ScrollingMovementMethod());

        //initialise imagebuttons
        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        //onclick listeners for imagebuttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(parentsGuardians.this, UserArea.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
