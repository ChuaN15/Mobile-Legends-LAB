package chuan.aov;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ViewProfileActivity extends AppCompatActivity {

    Hero newhero;

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(ViewProfileActivity.this,HeroContentActivity.class);
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
        intentt.putExtra("Hero",newhero);
        ViewProfileActivity.this.startActivity(intentt);
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
        final String gameid = intent.getStringExtra("gameid");
        final String click = intent.getStringExtra("click");
        final String position = intent.getStringExtra("position");

        intentt.putExtra("name", name);
        intentt.putExtra("email", email);
        intentt.putExtra("rank", rank);
        intentt.putExtra("password", password);
        intentt.putExtra("guild", guild);
        intentt.putExtra("role", role);
        intentt.putExtra("position", position);
        intentt.putExtra("gameid", gameid);
        intentt.putExtra("click", click);
        intentt.putExtra("Hero",newhero);

        return intentt;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);


        Intent intent = getIntent();
        final String email22 = intent.getStringExtra("email2");
        newhero = (Hero)intent.getSerializableExtra("Hero");

        String email3 = email22.substring(22);

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        TextView tvComment = (TextView) findViewById(R.id.tvcomment);
                        String name2 = jsonResponse.getString("name");
                        String rank2 = jsonResponse.getString("rank");
                        String password2 = jsonResponse.getString("password");
                        final String email2 = jsonResponse.getString("email");
                        String guild2 = jsonResponse.getString("guild");
                        String role2 = jsonResponse.getString("role");
                        String position2 = jsonResponse.getString("position");
                        String gameid2 = jsonResponse.getString("gameid");
                        String click2 = jsonResponse.getString("click");
                        String total2 = jsonResponse.getString("total");

                        String rolee = role2.toLowerCase();

                        Resources res = getResources();
                        int resID = res.getIdentifier(rolee , "drawable", "chuan.aov");
                        Drawable role1 = res.getDrawable(resID);

                        String rankk = rank2.toLowerCase() + "3";

                        Resources res2 = getResources();
                        int resID2 = res2.getIdentifier(rankk , "drawable", "chuan.aov");
                        Drawable rank1 = res2.getDrawable(resID2);

                        TextView tvName = (TextView) findViewById(R.id.tvprofilename);
                        TextView tvEmail = (TextView) findViewById(R.id.tvprofileemail);
                        TextView tvGuild = (TextView) findViewById(R.id.tvguild);
                        TextView tvGame = (TextView) findViewById(R.id.tvgameid);
                        TextView tvClick = (TextView) findViewById(R.id.tvclick);
                        LinearLayout llAllComments = (LinearLayout) findViewById(R.id.llallcomments);
                        ImageView ivBackground = (ImageView) findViewById(R.id.ivbackground);
                        ImageView ivPp = (ImageView) findViewById(R.id.ivpp);


                        tvComment.setText(total2);
                        setTitle(name2 + "'s Profile");
                        ivPp.setImageDrawable(rank1);
                        ivBackground.setBackground(role1);
                        tvName.setText(name2);
                        tvEmail.setText(email2);
                        tvGuild.setText(guild2);
                        tvGame.setText(gameid2);
                        tvClick.setText(click2);

                        llAllComments.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intentt = new Intent(ViewProfileActivity.this,ViewCommentsActivity.class);
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


                                intentt.putExtra("email2", email22);
                                intentt.putExtra("name", name);
                                intentt.putExtra("email", email);
                                intentt.putExtra("rank", rank);
                                intentt.putExtra("password", password);
                                intentt.putExtra("guild", guild);
                                intentt.putExtra("role", role);
                                intentt.putExtra("position", position);
                                intentt.putExtra("gameid", gameid);
                                intentt.putExtra("click", click);
                                intentt.putExtra("Hero",newhero);

                                ViewProfileActivity.this.startActivity(intentt);
                            }
                        });


                    } else {
                        String email3 = email22.substring(22);
                        TextView tvEmail = (TextView) findViewById(R.id.tvprofileemail);
                        tvEmail.setText("Email : " + email3);
                        AlertDialog.Builder builder = new AlertDialog.Builder(ViewProfileActivity.this);
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

        DisplayProfileRequest registerRequest = new DisplayProfileRequest(email3,responseListener);
        RequestQueue queue = Volley.newRequestQueue(ViewProfileActivity.this);
        queue.add(registerRequest);
    }
}
