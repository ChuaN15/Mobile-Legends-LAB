package chuan.aov;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ProfileActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(ProfileActivity.this,MenuActivity.class);
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
        ProfileActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_profile);

        LinearLayout llAllComments = (LinearLayout) findViewById(R.id.llallcomments);

        llAllComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(ProfileActivity.this,ViewProfileCommentsActivity.class);
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

                ProfileActivity.this.startActivity(intentt);
            }
        });

        LinearLayout llQrCode = (LinearLayout) findViewById(R.id.llqrcode);

        llQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(ProfileActivity.this,DisplayQrCodeActivity.class);
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

                ProfileActivity.this.startActivity(intentt);
            }
        });

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        TextView tvComment = (TextView) findViewById(R.id.tvcomment);
                        String total = jsonResponse.getString("total");
                        tvComment.setText(total);
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
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

        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");

        CountCommentRequest registerRequest = new CountCommentRequest(email,responseListener);
        RequestQueue queue = Volley.newRequestQueue(ProfileActivity.this);
        queue.add(registerRequest);

        final String rank = intent.getStringExtra("rank");
        final String name = intent.getStringExtra("name");
        final String password = intent.getStringExtra("password");
        final String guild = intent.getStringExtra("guild");
        final String role = intent.getStringExtra("role");
        final String position = intent.getStringExtra("position");
        final String gameid = intent.getStringExtra("gameid");
        final String click = intent.getStringExtra("click");

        String rolee = role.toLowerCase();

        Resources res = getResources();
        int resID = res.getIdentifier(rolee , "drawable", "chuan.aov");
        Drawable role1 = res.getDrawable(resID);

        String rankk = rank.toLowerCase() + "3";

        Resources res2 = getResources();
        int resID2 = res2.getIdentifier(rankk , "drawable", "chuan.aov");
        Drawable rank1 = res2.getDrawable(resID2);

        Button btnUpdate = (Button) findViewById(R.id.btn_update);
        TextView tvName = (TextView) findViewById(R.id.tvprofilename);
        TextView tvClick = (TextView) findViewById(R.id.tvclick);
        TextView tvEmail = (TextView) findViewById(R.id.tvprofileemail);
        TextView tvGuild = (TextView) findViewById(R.id.tvguild);
        TextView tvGame = (TextView) findViewById(R.id.tvgameid);
        ImageView ivBackground = (ImageView) findViewById(R.id.ivbackground);
        ImageView ivPp = (ImageView) findViewById(R.id.ivpp);

        setTitle(name + "'s Profile");
        ivPp.setImageDrawable(rank1);
        ivBackground.setBackground(role1);
        tvClick.setText(click);
        tvName.setText(name);
        tvEmail.setText(email);
        tvGuild.setText(guild);
        tvGame.setText(gameid);


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,ProfileUpdateActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                ProfileActivity.this.startActivity(intent);
            }
        });
    }


}
