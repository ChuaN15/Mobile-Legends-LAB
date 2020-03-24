package chuan.aov;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.VolleyLog.TAG;

public class HeroContentActivity extends AppCompatActivity {
    EditText _etcomment;
    Button _btncomment;
    private String theUrl;
    Hero newhero;

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(HeroContentActivity.this,HeroTankActivity.class);
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
        HeroContentActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_hero_content);

        Intent intent = getIntent();
        newhero = (Hero)intent.getSerializableExtra("Hero");
        final String name = newhero.namee;
        final String email = intent.getStringExtra("email");
        final WebView webView = (WebView) findViewById(R.id.webcomment);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        final TextView tvcomment = (TextView) findViewById(R.id.link_comment);
        tvcomment.setText("Load All Comments");

        tvcomment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvcomment.getText() == "Load All Comments")
                {
                    tvcomment.setText("Show Less Comments");
                    webView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                }
                else if (tvcomment.getText() == "Show Less Comments")
                {
                    tvcomment.setText("Load All Comments");
                    webView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1130));
                }
            }
        });


        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        TextView tvComment = (TextView) findViewById(R.id.tvComment2);
                        String total = jsonResponse.getString("total");
                        tvComment.setText("Comments (" + total + ")");
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(HeroContentActivity.this);
                        builder.setMessage("Email Address registered before , please use another email address !")
                                .setOnCancelListener(null)
                                .create()
                                .show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        DisplayCommentRequest registerRequest = new DisplayCommentRequest(name,responseListener);
        RequestQueue queue = Volley.newRequestQueue(HeroContentActivity.this);
        queue.add(registerRequest);


        webView.setBackgroundColor(Color.TRANSPARENT);
        if(email != null)
        {
            webView.loadUrl("http://pd10.xyz/ChuaN/displaycommenttry.php?namee=" + name + "&emaill=" + email);
        }
        else
        {
            webView.loadUrl("http://pd10.xyz/ChuaN/displaycommenttry.php?namee=" + newhero.namee + "&emaill=no@mllab.mllab");
        }


        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                webView.loadUrl("about:blank");
                Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
            }
        });

        if (!onNetworkSuccess()) {
            webView.loadUrl("about:blank");
            Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
        }


        EditText etComment = (EditText) findViewById(R.id.etComment);
        Button btnComment = (Button) findViewById(R.id.btn_comment);
        this._etcomment = etComment;
        this._btncomment = btnComment;

        String namee = intent.getStringExtra("name");
        if(namee == null)
        {
            _btncomment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getBaseContext(), "Please login to post comment", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else
        {
            _btncomment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    comment();
                }
            });
        }




         webView.setWebViewClient(new WebViewClient()
                                         {
                                             public boolean shouldOverrideUrlLoading(WebView view, String url)
                                             {
                                                 if (!url.contains("comment"))
                                                 {
                                                     Intent intent = getIntent();
                                                     TextInputLayout textInputLayout = (TextInputLayout)findViewById(R.id.tilComment);
                                                     final String name = intent.getStringExtra("name");
                                                     final String rank = intent.getStringExtra("rank");
                                                     final String email = intent.getStringExtra("email");
                                                     final String password = intent.getStringExtra("password");
                                                     final String guild = intent.getStringExtra("guild");
                                                     final String role = intent.getStringExtra("role");
                                                     final String position = intent.getStringExtra("position");
                                                     final String gameid = intent.getStringExtra("gameid");
                                                     final String click = intent.getStringExtra("click");


                                                     Intent intent2 = new Intent(HeroContentActivity.this,ViewProfileActivity.class);
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
                                                     intent.putExtra("Hero",newhero);
                                                     HeroContentActivity.this.startActivity(intent2);
                                                     return true;
                                                 }
                                                 else if (url.equals("http://pd10.xyz/ChuaN/displaycommenttry.php?namee=" + newhero.namee + "&emaill=no@mllab.mllab"))
                                                 {
                                                     Toast.makeText(getBaseContext(), "Please login to like comment", Toast.LENGTH_SHORT).show();
                                                 }
                                                 return false;
                                             }
                                         });




        TextInputLayout textInputLayout = (TextInputLayout)findViewById(R.id.tilComment);
        TextView tvName = (TextView) findViewById(R.id.tvname);
        TextView tvPrice = (TextView) findViewById(R.id.tvprice);
        TextView tvIntro = (TextView) findViewById(R.id.tvintro);
        ImageView iv1 = (ImageView) findViewById(R.id.ivguide1);
        ImageView ivstat = (ImageView) findViewById(R.id.ivstat);
        ImageView ivitem = (ImageView) findViewById(R.id.ivitembuild);
        ImageView ivskill = (ImageView) findViewById(R.id.ivskillbuild);
        TextView tvskill11 = (TextView) findViewById(R.id.tvskill11);
        TextView tvskill111 = (TextView) findViewById(R.id.tvskill111);
        TextView tvskill1 = (TextView) findViewById(R.id.tvskill1);
        ImageView ivskill1 = (ImageView) findViewById(R.id.ivskill1);
        TextView tvskill22 = (TextView) findViewById(R.id.tvskill22);
        TextView tvskill222 = (TextView) findViewById(R.id.tvskill222);
        TextView tvskill2 = (TextView) findViewById(R.id.tvskill2);
        ImageView ivskill2 = (ImageView) findViewById(R.id.ivskill2);
        TextView tvskill33 = (TextView) findViewById(R.id.tvskill33);
        TextView tvskill333 = (TextView) findViewById(R.id.tvskill333);
        TextView tvskill3 = (TextView) findViewById(R.id.tvskill3);
        ImageView ivskill3 = (ImageView) findViewById(R.id.ivskill3);
        TextView tvskill44 = (TextView) findViewById(R.id.tvskill44);
        TextView tvskill444 = (TextView) findViewById(R.id.tvskill444);
        TextView tvskill4 = (TextView) findViewById(R.id.tvskill4);
        ImageView ivskill4 = (ImageView) findViewById(R.id.ivskill4);

        String price = newhero.price;
        String intro = newhero.intro;
        String image1 = newhero.image1;
        String stat = newhero.imagestat;
        String itembuild = newhero.itembuild;
        String skillbuild = newhero.skillbuild;
        String skill11 = newhero.skill11;
        String skill111 = newhero.skill111;
        String skill1 = newhero.skill1;
        String images1 = newhero.images1;
        String skill22 = newhero.skill22;
        String skill222 = newhero.skill222;
        String skill2 = newhero.skill2;
        String images2 = newhero.images2;
        String skill33 = newhero.skill33;
        String skill333 = newhero.skill333;
        String skill3 = newhero.skill3;
        String images3 = newhero.images3;
        String skill44 = newhero.skill44;
        String skill444 = newhero.skill444;
        String skill4 = newhero.skill4;
        String images4 = newhero.images4;

        Resources res = getResources();
        int resID = res.getIdentifier(image1 , "drawable", "chuan.aov");
        Drawable imagee1 = res.getDrawable(resID);

        Resources resskill1 = getResources();
        int resIDDskill1 = resskill1.getIdentifier(images1 , "drawable", "chuan.aov");
        Drawable imagees1 = resskill1.getDrawable(resIDDskill1);

        Resources resstat = getResources();
        int resIDDstat = resstat.getIdentifier(stat , "drawable", "chuan.aov");
        Drawable statt = resstat.getDrawable(resIDDstat);

        Resources resitembuild = getResources();
        int resIDDitembuild = resitembuild.getIdentifier(itembuild , "drawable", "chuan.aov");
        Drawable itembuildd = resitembuild.getDrawable(resIDDitembuild);

        Resources resskillbuild = getResources();
        int resIDDskillbuild = resskillbuild.getIdentifier(skillbuild , "drawable", "chuan.aov");
        Drawable skillbuildd = resskillbuild.getDrawable(resIDDskillbuild);

        Resources resskill2 = getResources();
        int resIDDskill2 = resskill2.getIdentifier(images2 , "drawable", "chuan.aov");
        Drawable imagees2 = resskill2.getDrawable(resIDDskill2);

        Resources resskill3 = getResources();
        int resIDDskill3 = resskill3.getIdentifier(images3 , "drawable", "chuan.aov");
        Drawable imagees3 = resskill3.getDrawable(resIDDskill3);

        Resources resskill4 = getResources();
        int resIDDskill4 = resskill4.getIdentifier(images4 , "drawable", "chuan.aov");
        Drawable imagees4 = resskill4.getDrawable(resIDDskill4);


        setTitle(name);
        textInputLayout.setHint("Thoughts on " + name);
        tvName.setText(name);
        tvPrice.setText(price);
        tvIntro.setText(intro);
        iv1.setImageDrawable(imagee1);
        ivstat.setImageDrawable(statt);
        ivitem.setImageDrawable(itembuildd);
        ivskill.setImageDrawable(skillbuildd);
        tvskill11.setText(skill11);
        tvskill111.setText(skill111);
        tvskill1.setText(skill1);
        ivskill1.setImageDrawable(imagees1);
        tvskill22.setText(skill22);
        tvskill222.setText(skill222);
        tvskill2.setText(skill2);
        ivskill2.setImageDrawable(imagees2);
        tvskill33.setText(skill33);
        tvskill333.setText(skill333);
        tvskill3.setText(skill3);
        ivskill3.setImageDrawable(imagees3);
        tvskill44.setText(skill44);
        tvskill444.setText(skill444);
        tvskill4.setText(skill4);
        ivskill4.setImageDrawable(imagees4);
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

    public void onNetworkFailed() {
        Toast.makeText(getBaseContext(), "Please check your network connection", Toast.LENGTH_SHORT).show();

        _btncomment.setEnabled(true);
    }

    public void comment() {
        Log.d(TAG, "comment");

        if (!onNetworkSuccess()) {
            onNetworkFailed();
            return;
        }

        else if (!validate()) {
            onSignupFailed();
            return;
        }

        _btncomment.setEnabled(true);

        final ProgressDialog progressDialog = new ProgressDialog(HeroContentActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Submitting comment...");
        progressDialog.show();

        new CountDownTimer(1500, 1000) {

            public void onTick(long millisUntilFinished) {
                // You don't need anything here
            }

            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();

        final Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String namee = newhero.namee;
        final String comment = _etcomment.getText().toString();

        // TODO: Implement your own signup logic here.

        final Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        final Response.Listener<String> responseListener = new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonResponse = new JSONObject(response);
                                    boolean success = jsonResponse.getBoolean("success");
                                    if (success) {
                                        TextView tvComment = (TextView) findViewById(R.id.tvComment2);
                                        String total = jsonResponse.getString("total");
                                        tvComment.setText("Comments (" + total + ")");
                                        _etcomment.setText("");
                                    } else {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(HeroContentActivity.this);
                                        builder.setMessage("Email Address registered before , please use another email address !")
                                                .setOnCancelListener(null)
                                                .create()
                                                .show();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        };

                        DisplayCommentRequest registerRequest = new DisplayCommentRequest(namee,responseListener);
                        RequestQueue queue = Volley.newRequestQueue(HeroContentActivity.this);
                        queue.add(registerRequest);

                        final WebView webView = (WebView) findViewById(R.id.webcomment);
                        WebSettings webSettings = webView.getSettings();
                        webView.getSettings().setDomStorageEnabled(true);
                        webSettings.setJavaScriptEnabled(true);



                        webView.setBackgroundColor(Color.TRANSPARENT);
                        if(email != null)
                        {
                            webView.loadUrl("http://pd10.xyz/ChuaN/displaycommenttry.php?namee=" + newhero.namee + "&emaill=" + email);
                        }
                        else
                        {
                            webView.loadUrl("http://pd10.xyz/ChuaN/displaycommenttry.php?namee=" + newhero.namee + "&emaill=no@mllab.mllab");
                        }


                        webView.setWebViewClient(new WebViewClient() {
                            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                                webView.loadUrl("about:blank");
                                Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
                            }
                        });
                    } else {
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        CommentRequest registerRequest = new CommentRequest(comment,email,namee,responseListener);
        RequestQueue queue = Volley.newRequestQueue(HeroContentActivity.this);
        queue.add(registerRequest);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 1000);
    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Comment failed", Toast.LENGTH_SHORT).show();

        _btncomment.setEnabled(true);
    }

    public void onSignupSuccess() {
        _btncomment.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public boolean validate() {
        boolean valid = true;

        String name = _etcomment.getText().toString();

        if (name.isEmpty()) {
            _etcomment.setError("Comment cannot empty");
            valid = false;
        } else {
            _etcomment.setError(null);
        }

        return valid;
    }
}
