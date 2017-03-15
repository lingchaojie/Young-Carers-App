package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateNewEvent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_event);


        final EditText ettitle = (EditText) findViewById(R.id.title);
        final EditText etdate = (EditText) findViewById(R.id.date);
        final EditText ettime = (EditText) findViewById(R.id.time);
        final TextView finish = (TextView)findViewById(R.id.finish);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = ettitle.getText().toString();
                String date = etdate.getText().toString();
                String time = ettime.getText().toString();

                Response.Listener<String> listener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success){
                                Intent back = new Intent(getApplicationContext(),CalendarPage.class);
                                getApplicationContext().startActivity(back);
                            }else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(CreateNewEvent.this);
                                builder.setMessage("Create new event failed!")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                EventRequest eventRequest = new EventRequest(Login.userid,title,date,time,listener);
                RequestQueue queue = Volley.newRequestQueue(CreateNewEvent.this);
                queue.add(eventRequest);
            }
        });

    }
}
