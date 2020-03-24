package chuan.aov;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class PurchaseRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://pd10.xyz/ChuaN/purchase2.php";
    private Map<String, String> params;

    public PurchaseRequest(String email, String total , String address, String ts1, String ts2, String ts3,String ts4, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("total", total);
        params.put("address", address);
        params.put("ts1", ts1);
        params.put("ts2", ts2);
        params.put("ts3", ts3);
        params.put("ts4", ts4);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
