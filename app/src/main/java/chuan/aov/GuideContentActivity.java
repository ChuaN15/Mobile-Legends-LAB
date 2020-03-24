package chuan.aov;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GuideContentActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(GuideContentActivity.this,GuidesActivity.class);
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
        GuideContentActivity.this.startActivity(intentt);
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
        intentt.putExtra("gameid",gameid);
        intentt.putExtra("click",click);
        return intentt;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_content);

        TextView tvName = (TextView) findViewById(R.id.tvname);
        TextView tvIntro = (TextView) findViewById(R.id.tvintro);
        TextView tvItemBuild = (TextView) findViewById(R.id.tvitembuild);
        ImageView ivstat = (ImageView) findViewById(R.id.ivstat);
        ImageView ivemblem = (ImageView) findViewById(R.id.ivemblem);
        ImageView ivitem = (ImageView) findViewById(R.id.ivitembuild);
        ImageView ivskill = (ImageView) findViewById(R.id.ivspell);
        TextView tvspell = (TextView) findViewById(R.id.tvspell);
        TextView tvemblem = (TextView) findViewById(R.id.tvemblem);
        TextView tvtips = (TextView) findViewById(R.id.tvtips);
        TextView tvsummary = (TextView) findViewById(R.id.tvsummary);
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

        Intent intent = getIntent();
        String name = intent.getStringExtra("namee");
        String emblem = intent.getStringExtra("emblem");
        String intro = intent.getStringExtra("intro");
        String itemdesc = intent.getStringExtra("itemdesc");
        String spell = intent.getStringExtra("spell");
        String emblemtext = intent.getStringExtra("emblemtext");
        String tips = intent.getStringExtra("tips");
        String summary = intent.getStringExtra("summary");
        String stat = intent.getStringExtra("imagestat");
        String itembuild = intent.getStringExtra("itembuild");
        String skillbuild = intent.getStringExtra("skillbuild");
        String skill11 = intent.getStringExtra("skill11");
        String skill111 = intent.getStringExtra("skill111");
        String skill1 = intent.getStringExtra("skill1");
        String images1 = intent.getStringExtra("images1");
        String skill22 = intent.getStringExtra("skill22");
        String skill222 = intent.getStringExtra("skill222");
        String skill2 = intent.getStringExtra("skill2");
        String images2 = intent.getStringExtra("images2");
        String skill33 = intent.getStringExtra("skill33");
        String skill333 = intent.getStringExtra("skill333");
        String skill3 = intent.getStringExtra("skill3");
        String images3 = intent.getStringExtra("images3");
        String skill44 = intent.getStringExtra("skill44");
        String skill444 = intent.getStringExtra("skill444");
        String skill4 = intent.getStringExtra("skill4");
        String images4 = intent.getStringExtra("images4");
        String gameid = intent.getStringExtra("gameid");
        String click = intent.getStringExtra("click");

        Resources resskill1 = getResources();
        int resIDDskill1 = resskill1.getIdentifier(images1 , "drawable", "chuan.aov");
        Drawable imagees1 = resskill1.getDrawable(resIDDskill1);

        Resources resstat = getResources();
        int resIDDstat = resstat.getIdentifier(stat , "drawable", "chuan.aov");
        Drawable statt = resstat.getDrawable(resIDDstat);

        Resources resemblem = getResources();
        int resIDDemblem = resemblem.getIdentifier(emblem , "drawable", "chuan.aov");
        Drawable emblemm = resemblem.getDrawable(resIDDemblem);

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

        tvName.setText(name);
        tvIntro.setText(intro);
        tvItemBuild.setText(itemdesc);
        tvspell.setText(spell);
        tvemblem.setText(emblemtext);
        tvtips.setText(tips);
        tvsummary.setText(summary);
        ivstat.setImageDrawable(statt);
        ivitem.setImageDrawable(itembuildd);
        ivemblem.setImageDrawable(emblemm);
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
}
