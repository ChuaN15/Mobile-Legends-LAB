package chuan.aov;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class PasswordRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://pd10.xyz/ChuaN/password2.php";
    private Map<String, String> params;

    public PasswordRequest(String email, String name , Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
