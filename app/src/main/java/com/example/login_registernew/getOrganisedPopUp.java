package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

public class getOrganisedPopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_organised_pop_up);

        //get the resolution of the device screen and store it in variable dm
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //initialize and setwidth and height variables of pop up window
        int width = (dm.widthPixels);
        int height = (dm.heightPixels);

        //set the size of the pop up windows to 80% of the screen size
        getWindow().setLayout((int)(width*0.85), (int)(height*0.85));

        //set background to dim
        WindowManager.LayoutParams windowManager = getWindow().getAttributes();
        windowManager.dimAmount = 0.5f;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        TextView mytext = (TextView) findViewById(R.id.textView);
        mytext.setText("Get Organised");

    }
}
