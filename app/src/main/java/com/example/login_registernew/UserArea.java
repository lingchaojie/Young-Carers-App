package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);


        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        final ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        final ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        final ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuinflater = getMenuInflater();
        mMenuinflater.inflate(R.menu.area_menu,menu);
        return true;
    }
}
