package com.example.login_registernew;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 14/03/2017.
 */

public class EventRequest extends StringRequest {

    private static final String EVENT_REQUEST_URL = "http://alvinling.000webhostapp.com/CreateEvent.php";
    private Map<String,String> params;

    public EventRequest(int ownerid, String title, String date, String time, Response.Listener<String> listener){
        super(Method.POST,EVENT_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("ownerid",ownerid + "");
        params.put("title", title);
        params.put("date", date);
        params.put("time", time);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
