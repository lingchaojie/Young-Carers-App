package com.example.login_registernew;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 15/03/2017.
 */

public class GetEventRequest extends StringRequest {

    private static final String GET_EVENT_URL = "http://alvinling.000webhostapp.com/GetEvent.php";
    Map<String,String> params;

    public GetEventRequest(int USER_ID, Response.Listener<String> listener){
        super(Method.POST,GET_EVENT_URL,listener,null);
        params = new HashMap<>();
        params.put("USER_ID",USER_ID + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
