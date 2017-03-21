package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        

    }
}
