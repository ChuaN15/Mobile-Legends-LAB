package chuan.aov;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.VolleyLog.TAG;

public class PopularActivity extends AppCompatActivity {

    Button _btnchange;
    WebView webView;


    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(PopularActivity.this,MenuActivity.class);
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
        PopularActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_popular);

        setTitle("MLLAB Leaderboard");

        Button _btnchange = (Button) findViewById(R.id.btn_change);
        this._btnchange = _btnchange;
        _btnchange.setText("Chart View");

        _btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change();
            }
        });

        final WebView webView = (WebView) findViewById(R.id.web1);

        final ProgressDialog progressDialog = new ProgressDialog(PopularActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Retrieving Data...");
        progressDialog.show();

        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(true);
        webView.loadUrl("http://pd10.xyz/ChuaN/popular.php");
        this.webView = webView;

        new CountDownTimer(1000, 1000) {

            public void onTick(long millisUntilFinished) {
                // You don't need anything here
            }

            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();

        if (!onNetworkSuccess()) {
            webView.loadUrl("about:blank");
            Toast.makeText(getBaseContext(), "Please check your network connection", Toast.LENGTH_SHORT).show();

            new android.os.Handler().postDelayed(
                    new Runnable() {
                        public void run() {
                            Intent intentt = new Intent(PopularActivity.this, MenuActivity.class);
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
                            PopularActivity.this.startActivity(intentt);
                        }
                    }, 1000);

        }

        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                webView.loadUrl("about:blank");
                Toast.makeText(getBaseContext(), "Please check your network connection", Toast.LENGTH_SHORT).show();

                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Intent intentt = new Intent(PopularActivity.this, MenuActivity.class);
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
                                PopularActivity.this.startActivity(intentt);
                            }
                        }, 1000);

            }
        });

        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (!url.contains("popular")) {
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


                    Intent intent2 = new Intent(PopularActivity.this, ViewProfileActivity2.class);
                    intent2.putExtra("email2", url);
                    intent2.putExtra("name", name);
                    intent2.putExtra("email", email);
                    intent2.putExtra("rank", rank);
                    intent2.putExtra("password", password);
                    intent2.putExtra("guild", guild);
                    intent2.putExtra("role", role);
                    intent2.putExtra("position", position);
                    intent2.putExtra("gameid", gameid);
                    intent2.putExtra("click", click);

                    PopularActivity.this.startActivity(intent2);
                    return true;
                }
                return false;
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

    public void change() {
        Log.d(TAG, "change");

        if (!onNetworkSuccess()) {
            webView.loadUrl("about:blank");
            Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
            return;
        }

        final ProgressDialog progressDialog = new ProgressDialog(PopularActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Processing...");
        progressDialog.show();

        new CountDownTimer(500, 1000) {

            public void onTick(long millisUntilFinished) {
                // You don't need anything here
            }

            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();



                        if(_btnchange.getText() == "Chart View") {
                            _btnchange.setText("Text View");
                            webView.loadUrl("http://pd10.xyz/ChuaN/popular2.php");
                        }
                        else {
                            _btnchange.setText("Chart View");
                            webView.loadUrl("http://pd10.xyz/ChuaN/popular.php");
                        }
        };
}
