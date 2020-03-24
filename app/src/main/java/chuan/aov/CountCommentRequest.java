package chuan.aov;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class CountCommentRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://pd10.xyz/ChuaN/countplayercomment.php";
    private Map<String, String> params;

    public CountCommentRequest(String name2, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name2", name2);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
