package com.example.login_registernew;

;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://alvinling.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String firstname, String lastname, int age, String birthday, String email, String username, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("birthday",birthday);
        params.put("firstname", firstname);
        params.put("lastname", lastname);
        params.put("email",email);
        params.put("age", age + "");
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
