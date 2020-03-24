package chuan.aov;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class CommentRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://pd10.xyz/ChuaN/insertcomment.php";
    private Map<String, String> params;

    public CommentRequest(String comment,String email,String namee, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("comment", comment);
        params.put("email", email);
        params.put("namee", namee);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
