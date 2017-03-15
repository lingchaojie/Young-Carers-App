package com.example.login_registernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CalendarPage extends AppCompatActivity {
    private List<Event> eventList;
    private ListView mlist;
    private EventAdapter adapter;
    private ImageView calendar;
    private ImageView write;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);

        mlist = (ListView)findViewById(R.id.listview);
        eventList = new ArrayList<>();

        adapter = new EventAdapter(eventList,getApplication());
        mlist.setAdapter(adapter);


        final int USER_ID = Login.userid;

        Response.Listener<String> listener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray result = jsonObject.getJSONArray("response");
                    int i = 0;
                    while (i < result.length()) {
                        JSONObject data = result.getJSONObject(i);
                        String title = data.getString("EVENT_TITLE");
                        String date = data.getString("EVENT_DATE");
                        String time = data.getString("EVENT_TIME");
                        eventList.add(new Event(title,date,time,USER_ID));
                        i++;
                    }
                    adapter.notifyDataSetChanged();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        GetEventRequest getEventRequest = new GetEventRequest(USER_ID,listener);
        RequestQueue queue = Volley.newRequestQueue(CalendarPage.this);
        queue.add(getEventRequest);





        calendar = (ImageView)findViewById(R.id.calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChangeToCalendar = new Intent(getApplicationContext(),CalendarWindow.class);
                getApplicationContext().startActivity(ChangeToCalendar);
            }
        });

        write = (ImageView) findViewById(R.id.write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChangeToCreate = new Intent(getApplicationContext(),CreateNewEvent.class);
                getApplicationContext().startActivity(ChangeToCreate);
            }
        });
    }



}
