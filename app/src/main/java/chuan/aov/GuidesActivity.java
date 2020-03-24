package chuan.aov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class GuidesActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(GuidesActivity.this,MenuActivity.class);
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
        GuidesActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_guides);

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

        FrameLayout llguide = (FrameLayout) findViewById(R.id.guide1);
        llguide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GuidesActivity.this,GuideContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("namee", "“INITIATING GOD” TIGREAL GUIDE [BY TRIPLE C]");
                intent.putExtra("intro", "People love to play Marksman, Mages, Assassins and Carries. Tanks and Initiators are underrated. There are always team that needed Tanks and Initiators but minority number of players could fill that role. Today, I am going to show you how to win losing games while having a lot of fun. Tigreal can fill both initiator and tank role (Initiating a teamfight is definitely fun!). To be honest, Tigreal is the best Initiator so far.\n" +
                        "\n" +
                        "“AHAHAH! A true hero has come to help.”" +
                        "\n" +
                        "Tigreal’s model was reworked and now he looks bad*ss as ever");
                intent.putExtra("imagestat","guidetigreal");
                intent.putExtra("itembuild","tigrealitem");
                intent.putExtra("emblem","tigrealemblem");
                intent.putExtra("itembuild","tigrealitem");
                intent.putExtra("skillbuild","guideflicker");
                intent.putExtra("images1","tigreal1");
                intent.putExtra("images2","tigreal2");
                intent.putExtra("images3","tigreal3");
                intent.putExtra("images4","tigreal4");
                intent.putExtra("skill11","FEARLESS");
                intent.putExtra("skill111","Passive");
                intent.putExtra("skill22","ATTACK WAVE");
                intent.putExtra("skill222","Cooldown 9.5  Mana Cost 80");
                intent.putExtra("skill33","SACRED HAMMER");
                intent.putExtra("skill333","Cooldown 12.5  Mana Cost 110");
                intent.putExtra("skill44","IMPLOSION");
                intent.putExtra("skill444","Cooldown 36  Mana Cost 120");
                intent.putExtra("spell","The only useful and viable battle spell on Tigreal, also the reason why Tigreal is so good at initiating teamfights. I wouldn’t recommend taking any other spell other than Flicker. If your account level is not high enough to use Flicker, level it up ASAP! (Use Execute meanwhile then).\n" +
                        "\n" +
                        "You can use Flicker to either escape or initiate a teamfight (which you mainly do). There are so many plays you could make with your Flicker + Tigreal’s ultimate ability.");
                intent.putExtra("itemdesc","Item build on Tigreal isn’t really important as long as it is tanky. Some cooldown reduction helps a little as well.\n" +
                        "\n" +
                        "DO NOT BUY ANY ATTACK ITEMS ON TIGREAL. It won’t end up good.\n" +
                        "Here is some sample of my item builds. The first one used to be extremely powerful, Blade Armor and Cursed Helmet both are extremely powerful until both of them got nerfed so I wouldn’t recommend to use it anymore. Cursed Helmet and Blade Armor both helps with some DPS while being tank enough, but now it is not really required anymore.\n" +
                        "\n" +
                        "The “Tank 1” and “Tank 2” both are good. You can change in between items to find out which suits your playstyle the most! Just remember, don’t buy any attack items. You can buy Saint’s Refuge and/or Cursed Helmet if you are against heavily magic-based enemy team.\n" +
                        "\n" +
                        "Warrior Boots is the best option, cheap with powerful unique passive.");
                intent.putExtra("emblemtext","Roamer Emblem Set would be the best if it’s max-leveled. 6.05% movement speed boost would be awesome on Tigreal. Otherwise, use any emblem that has the highest attribute bonus \uD83D\uDE42");
                intent.putExtra("tips","Early Game\n" +
                        "\n" +
                        "Your early game plan would be almost like any other support. Go either top or bottom lane with a teammate, gives all the last hit on minions and jungle farm to your teammates. DON’T CLEAR JUNGLE ON YOUR OWN. If an enemy was out of position in lane,\n" +
                        "\n" +
                        "For example:\n" +
                        "\n" +
                        "-Enemy is standing near your turret\n" +
                        "\n" +
                        "-Enemy is standing far away from their turret range, while there’s 2 or more allies nearby to help\n" +
                        "\n" +
                        "You can flicker behind them, and Sacred Hammer to push them away from their turret, follow up with Attack Wave and 2nd activation on Sacred Hammer. If you are level 4, use the basic initiating combo then. This can happen in any other places such as  jungle, turtle/lord areas as well, not just in the lane.\n" +
                        "\n" +
                        "Roam around and leave your lane! If you doubt yourself in lane, go roam! Try gank the other lanes if possible, use the basic initiating combo or no-flicker initiating combo. As a support, you won’t have much stuff to do while clearing the lanes, so always look at the map and ping which lane’s has enemy missing. It might help your teammates. Knowing what to do in early game is very crucial, transition into mid and late game.\n" +
                        "\n" +
                        "Mid Game/Late Game\n" +
                        "\n" +
                        "Mid game mostly are the same with early games, always stick with your team, you won’t be any useful without your team! (Other than defending turrets of course, probably the only time you are alone).\n" +
                        "\n" +
                        "From mid-late game, the way you initiate might points a game to victory or defeat, be very careful on the next step you made. Tell your team to let you initiate first, so they don’t get caught easily. Use the signal on the right side of the screen “Attack!” to let them know you are initiating.\n" +
                        "\n" +
                        "Grouping 5-man with Tigreal is always the strongest. I suggest not to initiate/engage when one or more of your teammates aren’t near , whether they are split pushing, farming, clearing jungles etc UNLESS you are 100% sure that your team outnumbered/outfarmed/outfed  and 100% win against the enemy, then you can proceed with your basic initiating combo. ");
                intent.putExtra("summary","Your most basic initiating combo would be Flicker > Implosion > Walks behind the stunned enemies > Sacred Hammer to push them into your team > 2nd activation on Sacred Hammer\n" +
                        "\n" +
                        "Without flicker/flicker on cooldown? Let’s call it no-flicker initiating combo – Sacred Hammer, dash into the enemies > Implosion > 2nd activation on Sacred Hammer\n" + "There are almost zero counters against Tigreal combo if you are quick enough, and they have no Purify or Flicker fast enough away from Tigreal’s ultimate. You can turn a losing team to a winning team with a perfect teamfight. With Tigreal, you can get so much clean aces with a initiating combo.\n" +
                        "\n" +
                        "It would be definitely better if you could play with some friends, they could understand your game plan better with any communicating platforms. Tigreal is definitely a very fun hero to play, definitely worth to buy it in the shop if you haven’t already! So, go have some fun and let us know how it turns out for you! Happy initiating! ^^");




                intent.putExtra("skill1","Each attack will increase the hero’s physical and magic resistance, stacking up to 5 layers. The effect increases with the level.\n" +
                        "\n" +
                        "-You don’t have to hit a target to start stacking.\n" +
                        "\n" +
                        "-This passive ability doesn’t help much, but it is always nice to have more resistance especially in early game, use your basic attack!");
                intent.putExtra("skill2","Fires an attack wave in a specified direction, dealing 350 pts of physical damage to the enemy and lowers the enemy’s movement speed 65%, lasting 2s.\n" +
                        "\n" +
                        "-This ability is mainly for harassing and minor crowd control, helps chasing/finishing an low life enemy too.\n" +
                        "\n" +
                        "-Always manually aim! (Drag the ability and aim)");
                intent.putExtra("skill3","Rushes in a specified direction and collides with the enemy, dealing 0 pts of physical damage. If the skill hits the target by success, the hero can launch a second-stage attack, dealing 180 pts of physical damage and knocking the enemy airborne.\n" +
                        "\n" +
                        "-The first dash doesn’t deal any physical damage, only the 2nd attack that knocks up the enemy.\n" +
                        "\n" +
                        "-Always manually aim!\n" +
                        "\n" +
                        "-There is a minor text error in the ability, you DON’T HAVE TO hit a target to enable the 2nd attack.\n" +
                        "\n" +
                        "-You can use this ability to push your enemy to your team, or the turret. Combo well with your ultimate and flicker.");
                intent.putExtra("skill4","Forcefully thrusts his sword into the earth, pulling surrounding enemies to himself, dealing 270 pts of physical damage to them and stunning them for 1.5s.\n" +
                        "\n" +
                        "-Your main initiating ability.\n" +
                        "\n" +
                        "-Works extremely well with flicker.\n" +
                        "\n" +
                        "-Try it in game and get used with the Area of Effect radius\n" +
                        "\n" +
                        "– Use this skill carefully! It might impacts a lot in teamfight.");
                GuidesActivity.this.startActivity(intent);
            }
        });
        }
    }