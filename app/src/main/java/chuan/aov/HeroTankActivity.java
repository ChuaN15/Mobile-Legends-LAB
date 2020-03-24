package chuan.aov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class HeroTankActivity extends AppCompatActivity {

    Hero newhero;

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(HeroTankActivity.this,HeroesActivity.class);
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
        HeroTankActivity.this.startActivity(intentt);
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
        setContentView(R.layout.activity_hero_tank);

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

        FrameLayout fltigreal = (FrameLayout) findViewById(R.id.fltigreal);
        fltigreal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);

                newhero = new Hero("Tigreal","(6500bp / 299diamonds)",getString(R.string.tigrealintro),"tigreal","tigrealstat","tigrealitembuild","tigrealskillbuild","tigreal1","tigreal2","tigreal3","tigreal4","FEARLESS","Passive","ATTACK WAVE","Cooldown 9.5  Mana Cost 80","SACRED HAMMER","Cooldown 12.5  Mana Cost 110","IMPLOSION","Cooldown 36  Mana Cost 120",getString(R.string.tigrealskill1),"Fires an attack wave in a specified direction, dealing 300 pts of Physical Damage to the enemy and lowers the enemy's movement speed 50%, lasting 2s.","Rushes in a specified direction and collides with the enemy, dealing 180 pts of Physical Damage. If the hit dealt by success, the hero can launch a second stage attack, dealing 180 pts of Physical Damage and knocking the enemy airborne.","Forcefully thrusts his sword into the earth, pulling surrounding enemies to himself and dealing 340 pts of Physical Damage and stunning them for 1.5s.");
                intent.putExtra("Hero",newhero);
                HeroTankActivity.this.startActivity(intent);


            }
        });

        FrameLayout flakai = (FrameLayout) findViewById(R.id.flakai);
        flakai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);

                newhero = new Hero("Akai","(32000bp / 500Diamonds)","A clumsy panda from a far away Eastern villages dreams every night of becoming a mighty warrior. Akai is fat and clumsy even for panda standards and most people say that all he\\'s good for is rolling round. However, this never fazed Akai, as he trained daily, hoping to one day achieve his dreams of becoming a respected warrior. His friends mocked him, his parents discouraged him but Akai persisted. Soon one day, a mysterious old monk took notice of Akai\\'s persistance and took him under his guidance. Akai flourished under the training of the monk, mastering the arts of the flail. He is now ready to enter the world stage and prove that he is a worthy member of the martial world!","akai","akaistat","akaiitembuild","akaiskillbuild","akai1","akai2","akai3","akai4","TAI CHI","Passive","THOUSAND POUNDER","Cooldown 11  Mana Cost 70","BLENDER","Cooldown 8.5  Mana Cost 70","WIND DANCE","Cooldown 40  Mana Cost 120","Every time Akai casts a spell, he will receive a shield that on top of his maximum health that blocks a percentage of damage taken, this effect will go on cooldown after the last shield for a set amount of time.","Jump into the target area, dealing 170 Physical Damage to enemies when landing and a 55% slow down effect. For the next 3s, the following basic attacks will deal an extra 50% Physical Damage.","Fires a shock wave at the enemy, shock wave will explode on contact with the enemy or once it reaches maximum range, dealing physical damage, marking enemies; basic attacks on marked targets get a percentage of Akai's maximum health as extra physical damage.","Spins like a tornado for a period of time. Each collision will knock back the target and deal magic damage. During this process, the hero is immune to slow down effects, and casting this ability will remove any negative effects from the hero. Movement speed will be increased for the duration of the skill.");
                intent.putExtra("Hero",newhero);
                HeroTankActivity.this.startActivity(intent);
            }
        });

        FrameLayout flfranco = (FrameLayout) findViewById(R.id.flfranco);
        flfranco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);

                newhero = new Hero("Franco","(32000bp / 749Diamonds)","Franco\\'s home is in the eternally frozen seas beyond the land of Nost Gal. This continent of ice and snow is where the sea people have made a life for themselves, but the resurrection of Captain Bane has destroyed their formerly peaceful lives. Franco and his comrades have banded together to oppose Bane\\'s rule and bring peace back to the seas.","franco","francostat","francoitembuild","francoskillbuild","franco1","franco2","franco3","franco4","WASTELAND FORCE","Passive","IRON HOOK","Cooldown 16  Mana Cost 105","FURY SHOCK","Cooldown 8  Mana Cost 40","BRUTAL MASSACRE","Cooldown 38  Mana Cost 110","Increases movement speed by 10% and regen 0.5% of max health per second if not hit in a short time.","Launches an iron hook toward a unit or location. The hook will snag the first unit it encounters, dragging the unit back to Franco and dealing 450/480/510/540/570/600 Physical Damage.","Lashes out and terrifies enemies, dealing 275/300/325/350/375/400 Physical Damage to nearby enemies and slowing their movement speed 70%/70%/70%/70%/70%/70%, lasting 1.5/1.5/1.5/1.5/1.5/1.5s.","Suppresses an enemy unit with 6 hacks in a row, disabling it and dealing 70 Physical Damage per each hit.");
                intent.putExtra("Hero",newhero);
                HeroTankActivity.this.startActivity(intent);
            }
        });

        FrameLayout flminotaur = (FrameLayout) findViewById(R.id.flminotaur);
        flminotaur.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("namee","Minotaur");
                intent.putExtra("price","(15000bp / 399Diamonds)");
                intent.putExtra("intro", "The labyrinth-dwelling Minotaur was once the symbol of power for the entire kingdom, up until he was defeated by a youth from a far-off land. In the many months and years since, he has trained alone in his labyrinth, hoping for the day when he might have a chance of defeating that young man. Time endowed the Minotaur with intelligence, and he learned how to concentrate his fury into more powerful explosions of strength. When he finally emerged from his labyrinth, he discovered that the thriving Minoan civilization had long ceased to be, and that the whole world had moved on. As he sat lamenting the absence of a proper outlet to show off his powers, a voice from a distant alternate dimension summoned him. This is how the Minotaur came to the Land of Dawn, where he can fully unleash his powers and restore his name as a Son of Minos.");
                intent.putExtra("image1","minotaur");
                intent.putExtra("imagestat","minotaurstat");
                intent.putExtra("itembuild","minotauritembuild");
                intent.putExtra("skillbuild","minotaurskillbuild");
                intent.putExtra("images1","mino1");
                intent.putExtra("images2","mino2");
                intent.putExtra("images3","mino3");
                intent.putExtra("images4","mino4");
                intent.putExtra("skill11","RAGE MODE");
                intent.putExtra("skill111","Passive");
                intent.putExtra("skill22","DESPAIR HAMMER");
                intent.putExtra("skill222","Cooldown 8");
                intent.putExtra("skill33","MOTIVATION ROAR");
                intent.putExtra("skill333","Cooldown 11");
                intent.putExtra("skill333","Cooldown 11");
                intent.putExtra("skill44","MINOAN FURY");
                intent.putExtra("skill444","Cooldown 40");
                intent.putExtra("skill1","When abilities or basic attacks hit enemies, Minotaur will become more enraged. When Rage is full, Minotaur will enter Rage Mode and receive extra armor and magic resist (effects increase with level), as well as extra effects for his abilities. When Rage Mode subsides, Mintoaur will be unable to build up Rage for a time.");
                intent.putExtra("skill2","Wields a warhammer and deals 330 Physical Damage to enemies within melee range in front of him, also lowering their movement speed 65%. If in Rage Mode, attack range will expand greatly.");
                intent.putExtra("skill3","Encourages himself and surrounding allies, regening 340 HP for himself and giving allies 50% healing. If in Rage Mode, a Rage Regen effect will be activated for 2, allowing him to regen HP after taking damage.");
                intent.putExtra("skill4","Strikes the ground in a row, causing shock waves that deal 270 Physical Damage to nearby enemies as well as 270 true damage. Also lowers target movement speed 50%. If in Rage Mode, his striking speed will increase, he will deal an extra attack, and enemies will be knocked airborne.");
                HeroTankActivity.this.startActivity(intent);
            }
        });

        FrameLayout fllolita = (FrameLayout) findViewById(R.id.fllolita);
        fllolita.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("namee","Lolita");
                intent.putExtra("price","(32000bp / 599Diamonds)");
                intent.putExtra("intro", "Lolita was born in a distant elven village, living a happy, uneventful life. That is, until war brought an end to those peaceful, safe days. Her whole village was destroyed in the war; her family torn apart. Just as her own life was in grave peril, Rooney, the master machinist of the City of Scholars, found her when he was passing through and took her back to Eruditio. To show her gratitude to the city, Lolita joined the City Guard and swore an oath to the death to defend its honor. Bruno very much admired and understood this young elf maiden\\'s spirit, and so he put in a request with the city scholars for their most advanced tech crystal-- the Noumenon Energy Core-- and bestowed it to Lolita. This powerful energy core endows Lolita\\'s tiny frame with the ability to discharge massive Bursts of force, even allowing her to control a giant mechanical hammer with ease.");
                intent.putExtra("image1","lolita");
                intent.putExtra("imagestat","lolitastat");
                intent.putExtra("itembuild","lolitaitembuild");
                intent.putExtra("skillbuild","lolitaskillbuild");
                intent.putExtra("images1","lolita1");
                intent.putExtra("images2","lolita2");
                intent.putExtra("images3","lolita3");
                intent.putExtra("images4","lolita4");
                intent.putExtra("skill11","NOUMENON ENERGY CORE");
                intent.putExtra("skill111","Passive");
                intent.putExtra("skill22","ENERGY ROCKET");
                intent.putExtra("skill222","Cooldown 6");
                intent.putExtra("skill33","PROTECTIVE SHIELD");
                intent.putExtra("skill333","Cooldown 13.5");
                intent.putExtra("skill44","NOUMENON BLAST");
                intent.putExtra("skill444","Cooldown 40");
                intent.putExtra("skill1","The Noumenon energy core under normal circumstances will slowly store up energy and provide shields to Lolita's allies. Every so often, Lolita's allies can come close to Lolita and get a shield.");
                intent.putExtra("skill2","Casts an energy rocket which will regen energy when it hits an enemy hero and deal 190 Magic Damage, also causing the enemy to slow down 50% for 1.5s. At the same time it immediately resets ability cooldown. If the 2nd cast hits the enemy while in the slow down period, it will cause a stun.");
                intent.putExtra("skill3","Raises a shield which blocks all ranged projectiles flying towards the shield.");
                intent.putExtra("skill4","After powering up for 2s, it will deal 380 to 1026 Magic Damage to enemies in a conical area in front of the hero according to current energy amount. While gathering power, the Noumenon energy will make the hero immune to damage, but enemy hero attacks will reduce the amount of energy. If total energy drops to 0, it will not do any damage, but it will return half of energy and cooldown time. During the power-up period, movement speed for enemies in the attack range will drop 75%.");
                HeroTankActivity.this.startActivity(intent);
            }
        });

        FrameLayout flgatotkaca = (FrameLayout) findViewById(R.id.flgatotkaca);
        flgatotkaca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("namee","Gatotkaca");
                intent.putExtra("price","(32000bp / 599Diamonds)");
                intent.putExtra("intro", "Gatotkaca \\'The Iron Bone\\' was the son of Bima and Arimbi from Arcapada universe.Since his childhood, he\\'s been a champion of Gods, fights vicious enemies of his homeland. Once lost and beaten near death,Gatotkaca arise as a mighty warrior from Pandava clan who possessed the supernatural power he got from the ultimate training inside the cauldron of heaven, Candradimuka.With his Antakusuma armor and Brajamusti-Brajadenta twin gauntlet, he can fly across the skies like lightning and hunt down his enemies, the furious Ashuras. Gatotkaca, the Knight of Priggadani is a symbol of bravery and devotion.*Based on \\'Garudayana\\' comic series created by Is Yuniarto, inspired from Indonesian traditional shadow puppets.");
                intent.putExtra("image1","gatotkaca");
                intent.putExtra("imagestat","gatotkacastat");
                intent.putExtra("itembuild","gatotkacaitembuild");
                intent.putExtra("skillbuild","gatotkacaskillbuild");
                intent.putExtra("images1","gatotkaca1");
                intent.putExtra("images2","gatotkaca2");
                intent.putExtra("images3","gatotkaca3");
                intent.putExtra("images4","gatotkaca4");
                intent.putExtra("skill11","STEEL BONES");
                intent.putExtra("skill111","Passive");
                intent.putExtra("skill22","BLAST IRON FIST");
                intent.putExtra("skill222","Cooldown 8 Mana Cost 70");
                intent.putExtra("skill33","UNBREAKABLE");
                intent.putExtra("skill333","Cooldown 13  Mana Cost 100");
                intent.putExtra("skill44","AVATAR OF GUARDIAN");
                intent.putExtra("skill444","Cooldown 60  Mana Cost 120");
                intent.putExtra("skill1","Converts 4% lost HP to his physical defense, up to 250. Every 6s, dealing damage to the enemies with higher HP grants 110~250 (increases with level) HP and 0.5 times HP of his physical damage.");
                intent.putExtra("skill2","Shatters the front ground, dealing 300 magical damage and slowing the enemies.");
                intent.putExtra("skill3","Gatotkaca shouts loudly, forcing nearby enemies to basic attack him for 1.5s. In the next 2.5s, he counters the attacker when hit, dealing 130 magical damage to nearby enemies.");
                intent.putExtra("skill4","Shortly charges and jumps to the target area, knocking nearby enemies into the air for 1s and dealing 500 magical damage. The enemy near to the center is knocked into the air for a longer time.");
                HeroTankActivity.this.startActivity(intent);
            }
        });

        FrameLayout fljohnson = (FrameLayout) findViewById(R.id.fljohnson);
        fljohnson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HeroTankActivity.this,HeroContentActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                intent.putExtra("namee","Johnson");
                intent.putExtra("price","(32000bp / 599Diamonds)");
                intent.putExtra("intro", "Johnson, with a hardy constitution as a rock, when he ran through the dome stadium like a heavy truck, the cheers of girls Burst out loud. He led the team to lift the champion\\'s trophies and achieved his peak of his life as a super quarterback with millions fans around. However, fortune is always fickle. A little girl rushed to the road in a sudden while Johnson was driving his sport car. To avoid hitting on the little girl, his car crashed severely. Massive hemorrhage was going to take away his life soon in a minute. At that moment, a miracle occurred, that the wreckage of the sport car started to blend into Johnson\\'s body by a mystery force. Consequently, he not only just survived from the crash, also became a magical new human who can transform to a sport car.");
                intent.putExtra("image1","johnson");
                intent.putExtra("imagestat","johnsonstat");
                intent.putExtra("itembuild","johnsonitembuild");
                intent.putExtra("skillbuild","johnsonskillbuild");
                intent.putExtra("images1","johnson1");
                intent.putExtra("images2","johnson2");
                intent.putExtra("images3","johnson3");
                intent.putExtra("images4","johnson4");
                intent.putExtra("skill11","ELECTRO-AIRBANG");
                intent.putExtra("skill111","Passive");
                intent.putExtra("skill22","IRON SACK");
                intent.putExtra("skill222","Cooldown 7");
                intent.putExtra("skill33","MISSILE TACKLE");
                intent.putExtra("skill333","Cooldown 10");
                intent.putExtra("skill44","RAPID TOUCHDOWN");
                intent.putExtra("skill444","Cooldown 53");
                intent.putExtra("skill1","When the hero's HP is lower than 30%, a shield will generate, absorbing an amount of damage based on his armor. Lasts 10s. This effect only can be triggered once within a period of time.");
                intent.putExtra("skill2","Upgrades the pilers. Next basic attack will deal 200 pts of [C3magic damage] plus an extra damage that equals 1.5 times the heroes armor, lowering the enemy's movement speed by 60% for 1s. If the target is affected by slowing effect, then they will be stunned for 1.s The same target can only be stunned once every 6s.");
                intent.putExtra("skill3","Launches several vehicular missiles forward to track enemies in a cone shaped area, dealing 250 pts of [C3magical damage] to them and lowering their movement speed by 70% for 2s.");
                intent.putExtra("skill4","Passive: Increases 10% of armor. Active: Johnson jumps up and transforms into a car, which will accelerate increasingly. One team mate can get in the car when it stops and rush froward along with Johnson. When the car hits the first enemy, it will explode and stun the target and nearby enemies for 0.7501.5 sec and according to the cars running speed, deal 300-600 pts of [C3magical damage] to them.");
                HeroTankActivity.this.startActivity(intent);
            }
        });
    }
}
