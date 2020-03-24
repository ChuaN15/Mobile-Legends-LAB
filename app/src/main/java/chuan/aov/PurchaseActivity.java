package chuan.aov;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.VolleyLog.TAG;

public class PurchaseActivity extends AppCompatActivity {

    int total = 0;
    String ts1 = "0",ts2 = "0",ts3 = "0",ts4 = "0";

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(PurchaseActivity.this,MenuActivity.class);
        //here you put the data that you want to send back - could be Serializable/Parcelable, etc

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final String rank = intent.getStringExtra("rank");
        final String email = intent.getStringExtra("email");
        final String password = intent.getStringExtra("password");
        final String guild = intent.getStringExtra("guild");
        final String role = intent.getStringExtra("role");
        final String position = intent.getStringExtra("position");
        final String gameid = intent.getStringExtra("gameid");
        final String click = intent.getStringExtra("click");

        intentt.putExtra("name", name);
        intentt.putExtra("email", email);
        intentt.putExtra("rank", rank);
        intentt.putExtra("password", password);
        intentt.putExtra("guild", guild);
        intentt.putExtra("role", role);
        intentt.putExtra("position", position);
        intentt.putExtra("gameid", gameid);
        intentt.putExtra("click", click);
        PurchaseActivity.this.startActivity(intentt);
    }

    @Override
    public Intent getParentActivityIntent () {
        Intent intentt = super.getParentActivityIntent();
        //here you put the data that you want to send back - could be Serializable/Parcelable, etc
        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final String rank = intent.getStringExtra("rank");
        final String email = intent.getStringExtra("email");
        final String password = intent.getStringExtra("password");
        final String guild = intent.getStringExtra("guild");
        final String role = intent.getStringExtra("role");
        final String position = intent.getStringExtra("position");
        final String gameid = intent.getStringExtra("gameid");
        final String click = intent.getStringExtra("click");

        intentt.putExtra("name", name);
        intentt.putExtra("email", email);
        intentt.putExtra("rank", rank);
        intentt.putExtra("password", password);
        intentt.putExtra("guild", guild);
        intentt.putExtra("role", role);
        intentt.putExtra("position", position);
        intentt.putExtra("gameid", gameid);
        intentt.putExtra("click", click);
        return intentt;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Button _btnpurchase = (Button) findViewById(R.id.btn_purchase);
        Button _btncancel = (Button) findViewById(R.id.btn_cancel);
        final TextView _total = (TextView) findViewById(R.id.tvtotal);
        final ImageView _ivts1 = (ImageView) findViewById(R.id.ivts1);
        final ImageView _ivts2 = (ImageView) findViewById(R.id.ivts2);
        final ImageView _ivts3 = (ImageView) findViewById(R.id.ivts3);
        final ImageView _ivts4 = (ImageView) findViewById(R.id.ivts4);
        FrameLayout _flts1 = (FrameLayout) findViewById(R.id.flts1);
        FrameLayout _flts2 = (FrameLayout) findViewById(R.id.flts2);
        FrameLayout _flts3 = (FrameLayout) findViewById(R.id.flts3);
        FrameLayout _flts4 = (FrameLayout) findViewById(R.id.flts4);

        _flts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ts1 == "0") {
                    ts1 = "1";
                    total = total + 50;
                    _ivts1.setImageDrawable(getResources().getDrawable(R.drawable.tscyclops2));
                }
                else {
                    ts1 = "0";
                    total = total - 50;
                    _ivts1.setImageDrawable(getResources().getDrawable(R.drawable.tscyclops));
                }

                _total.setText("Total : RM" + total);
            }

        });

        _flts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ts2 == "0") {
                    ts2 = "1";
                    total = total + 50;
                    _ivts2.setImageDrawable(getResources().getDrawable(R.drawable.tsgatotkaca2));
                }
                else {
                    ts2 = "0";
                    total = total - 50;
                    _ivts2.setImageDrawable(getResources().getDrawable(R.drawable.tsgatotkaca));
                }

                _total.setText("Total : RM" + total);
            }

        });

        _flts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ts3 == "0") {
                    ts3 = "1";
                    total = total + 60;
                    _ivts3.setImageDrawable(getResources().getDrawable(R.drawable.tsgusion2));
                }
                else {
                    ts3 = "0";
                    total = total - 60;
                    _ivts3.setImageDrawable(getResources().getDrawable(R.drawable.tsgusion));
                }

                _total.setText("Total : RM" + total);
            }

        });

        _flts4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ts4 == "0") {
                    ts4 = "1";
                    total = total + 60;
                    _ivts4.setImageDrawable(getResources().getDrawable(R.drawable.tsmiya2));
                }
                else {
                    ts4 = "0";
                    total = total - 60;
                    _ivts4.setImageDrawable(getResources().getDrawable(R.drawable.tsmiya));
                }

                _total.setText("Total : RM" + total);
            }

        });

        _btnpurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purchase();
            }
        });

        _btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(PurchaseActivity.this,MenuActivity.class);
                Intent intent = getIntent();
                final String name = intent.getStringExtra("name");
                final String rank = intent.getStringExtra("rank");
                final String email = intent.getStringExtra("email");
                final String password = intent.getStringExtra("password");
                final String guild = intent.getStringExtra("guild");
                final String role = intent.getStringExtra("role");
                final String position = intent.getStringExtra("position");
                final String gameid = intent.getStringExtra("gameid");
                final String click = intent.getStringExtra("click");

                intentt.putExtra("name", name);
                intentt.putExtra("email", email);
                intentt.putExtra("rank", rank);
                intentt.putExtra("password", password);
                intentt.putExtra("guild", guild);
                intentt.putExtra("role", role);
                intentt.putExtra("position", position);
                intentt.putExtra("gameid", gameid);
                intentt.putExtra("click", click);
                PurchaseActivity.this.startActivity(intentt);
            }
        });
    }

    public boolean onNetworkSuccess() {
        boolean valid = true;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
        } else {
            valid = false;
        }
        return valid;
    }

    public void purchase() {
        Log.d(TAG, "change");

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final String rank = intent.getStringExtra("rank");
        final String email = intent.getStringExtra("email");
        final String password = intent.getStringExtra("password");
        final String guild = intent.getStringExtra("guild");
        final String role = intent.getStringExtra("role");
        final String position = intent.getStringExtra("position");
        final String gameid = intent.getStringExtra("gameid");
        final String click = intent.getStringExtra("click");

        EditText _addressText = (EditText) findViewById(R.id.purchase);

        String address = _addressText.getText().toString();

        if(name == null)
        {
            Toast.makeText(getBaseContext(), "Please login to purchase merchandise !", Toast.LENGTH_SHORT).show();
            return;
        }

        if(address.isEmpty() || address.length() < 1 ) {
                _addressText.setError("Address cannot be empty");
                Toast.makeText(getBaseContext(), "Purchase failed", Toast.LENGTH_SHORT).show();
                return;
            } else{
                _addressText.setError(null);
            }

        if (!onNetworkSuccess()) {
            Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
            return;
        }
        _addressText.setEnabled(true);

        final ProgressDialog progressDialog = new ProgressDialog(this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Purchasing...");
        progressDialog.show();

        // TODO: Implement your own signup logic here.




        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        Intent intentt = new Intent(PurchaseActivity.this,MenuActivity.class);
                        //here you put the data that you want to send back - could be Serializable/Parcelable, etc


                        intentt.putExtra("name", name);
                        intentt.putExtra("email", email);
                        intentt.putExtra("rank", rank);
                        intentt.putExtra("password", password);
                        intentt.putExtra("guild", guild);
                        intentt.putExtra("role", role);
                        intentt.putExtra("position", position);
                        intentt.putExtra("gameid", gameid);
                        intentt.putExtra("click", click);
                        PurchaseActivity.this.startActivity(intentt);

                        Toast.makeText(getBaseContext(), "Purchase successful, please check you email address proceed to next purchase stage !", Toast.LENGTH_LONG).show();

                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseActivity.this);
                        builder.setMessage("Purchase failed, might be server problem !")
                                .setOnCancelListener(null)
                                .create()
                                .show();

                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                    }
                                }, 1500);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };


        PurchaseRequest registerRequest = new PurchaseRequest(email,String.valueOf(total),address,ts1,ts2,ts3,ts4,responseListener);
        RequestQueue queue = Volley.newRequestQueue(PurchaseActivity.this);
        queue.add(registerRequest);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        setResult(RESULT_OK, null);
                        finish();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 1500);
    }
}
