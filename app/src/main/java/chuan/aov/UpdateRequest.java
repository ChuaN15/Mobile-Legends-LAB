package chuan.aov;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class UpdateRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://pd10.xyz/ChuaN/update2.php";
    private Map<String, String> params;

    public UpdateRequest(String name, String email , String rank, String guild, String role, String password,String gameid, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("rank", rank);
        params.put("guild", guild);
        params.put("role", role);
        params.put("password", password);
        params.put("gameid", gameid);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
