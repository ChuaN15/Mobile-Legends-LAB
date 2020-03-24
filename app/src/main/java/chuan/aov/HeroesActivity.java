package chuan.aov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HeroesActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(HeroesActivity.this,MenuActivity.class);
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
        HeroesActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_heroes);

        LinearLayout lltank = (LinearLayout) findViewById(R.id.lltank);

        lltank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(HeroesActivity.this,HeroTankActivity.class);
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
                HeroesActivity.this.startActivity(intentt);
            }
        });

        LinearLayout llassasin = (LinearLayout) findViewById(R.id.llassasin);
        llassasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(HeroesActivity.this,HeroAssasinActivity.class);
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
                HeroesActivity.this.startActivity(intentt);
            }
        });


        LinearLayout llfighter = (LinearLayout) findViewById(R.id.llfighter);
        llfighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(HeroesActivity.this,HeroFighterActivity.class);
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
                HeroesActivity.this.startActivity(intentt);
            }
        });

        LinearLayout llmage = (LinearLayout) findViewById(R.id.llmage);
        llmage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(HeroesActivity.this,HeroMageActivity.class);
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
                HeroesActivity.this.startActivity(intentt);
            }
        });
    }
}
