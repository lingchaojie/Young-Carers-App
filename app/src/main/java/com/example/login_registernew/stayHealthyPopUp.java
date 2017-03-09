package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class stayHealthyPopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_healthy_pop_up);

        //get the resolution of the device screen and store it in variable dm
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //initialize and setwidth and height variables of pop up window
        int width = (dm.widthPixels);
        int height = (dm.heightPixels);

        //set the size of the pop up windows to 80% of the screen size
        getWindow().setLayout((int)(width*0.8), (int)(height*0.8));

        TextView mytext = (TextView) findViewById(R.id.textView);
        mytext.setText("stay healthy page");

    }
}
