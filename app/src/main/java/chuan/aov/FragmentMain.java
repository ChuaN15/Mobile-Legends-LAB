package chuan.aov;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentMain.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentMain#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentMain extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView tvWelcomeMsg;
    String name = "123";
    SharedPreferences preferences;

    private OnFragmentInteractionListener mListener;

    public FragmentMain() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentMain.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentMain newInstance(String param1, String param2) {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_main, container,false);

        getActivity().setTitle("Mobile Legends LAB");

        FrameLayout llguide = (FrameLayout) rootView.findViewById(R.id.main1);
        llguide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentGuideContent fragmentt = new FragmentGuideContent();
                Bundle bundle = new Bundle();
                bundle.putString("name","“INITIATING GOD” TIGREAL GUIDE [BY TRIPLE C]");
                bundle.putString("intro", "People love to play Marksman, Mages, Assassins and Carries. Tanks and Initiators are underrated. There are always team that needed Tanks and Initiators but minority number of players could fill that role. Today, I am going to show you how to win losing games while having a lot of fun. Tigreal can fill both initiator and tank role (Initiating a teamfight is definitely fun!). To be honest, Tigreal is the best Initiator so far.\n" +
                        "\n" +
                        "“AHAHAH! A true hero has come to help.”" +
                        "\n" +
                        "Tigreal’s model was reworked and now he looks bad*ss as ever");
                bundle.putString("imagestat","guidetigreal");
                bundle.putString("itembuild","tigrealitem");
                bundle.putString("emblem","tigrealemblem");
                bundle.putString("itembuild","tigrealitem");
                bundle.putString("skillbuild","guideflicker");
                bundle.putString("images1","tigreal1");
                bundle.putString("images2","tigreal2");
                bundle.putString("images3","tigreal3");
                bundle.putString("images4","tigreal4");
                bundle.putString("skill11","FEARLESS");
                bundle.putString("skill111","Passive");
                bundle.putString("skill22","ATTACK WAVE");
                bundle.putString("skill222","Cooldown 9.5  Mana Cost 80");
                bundle.putString("skill33","SACRED HAMMER");
                bundle.putString("skill333","Cooldown 12.5  Mana Cost 110");
                bundle.putString("skill44","IMPLOSION");
                bundle.putString("skill444","Cooldown 36  Mana Cost 120");
                bundle.putString("spell","The only useful and viable battle spell on Tigreal, also the reason why Tigreal is so good at initiating teamfights. I wouldn’t recommend taking any other spell other than Flicker. If your account level is not high enough to use Flicker, level it up ASAP! (Use Execute meanwhile then).\n" +
                        "\n" +
                        "You can use Flicker to either escape or initiate a teamfight (which you mainly do). There are so many plays you could make with your Flicker + Tigreal’s ultimate ability.");
                bundle.putString("itemdesc","Item build on Tigreal isn’t really important as long as it is tanky. Some cooldown reduction helps a little as well.\n" +
                        "\n" +
                        "DO NOT BUY ANY ATTACK ITEMS ON TIGREAL. It won’t end up good.\n" +
                        "Here is some sample of my item builds. The first one used to be extremely powerful, Blade Armor and Cursed Helmet both are extremely powerful until both of them got nerfed so I wouldn’t recommend to use it anymore. Cursed Helmet and Blade Armor both helps with some DPS while being tank enough, but now it is not really required anymore.\n" +
                        "\n" +
                        "The “Tank 1” and “Tank 2” both are good. You can change in between items to find out which suits your playstyle the most! Just remember, don’t buy any attack items. You can buy Saint’s Refuge and/or Cursed Helmet if you are against heavily magic-based enemy team.\n" +
                        "\n" +
                        "Warrior Boots is the best option, cheap with powerful unique passive.");
                bundle.putString("emblemtext","Roamer Emblem Set would be the best if it’s max-leveled. 6.05% movement speed boost would be awesome on Tigreal. Otherwise, use any emblem that has the highest attribute bonus \uD83D\uDE42");
                bundle.putString("tips","Early Game\n" +
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
                bundle.putString("summary","Your most basic initiating combo would be Flicker > Implosion > Walks behind the stunned enemies > Sacred Hammer to push them into your team > 2nd activation on Sacred Hammer\n" +
                        "\n" +
                        "Without flicker/flicker on cooldown? Let’s call it no-flicker initiating combo – Sacred Hammer, dash into the enemies > Implosion > 2nd activation on Sacred Hammer\n" + "There are almost zero counters against Tigreal combo if you are quick enough, and they have no Purify or Flicker fast enough away from Tigreal’s ultimate. You can turn a losing team to a winning team with a perfect teamfight. With Tigreal, you can get so much clean aces with a initiating combo.\n" +
                        "\n" +
                        "It would be definitely better if you could play with some friends, they could understand your game plan better with any communicating platforms. Tigreal is definitely a very fun hero to play, definitely worth to buy it in the shop if you haven’t already! So, go have some fun and let us know how it turns out for you! Happy initiating! ^^");




                bundle.putString("skill1","Each attack will increase the hero’s physical and magic resistance, stacking up to 5 layers. The effect increases with the level.\n" +
                        "\n" +
                        "-You don’t have to hit a target to start stacking.\n" +
                        "\n" +
                        "-This passive ability doesn’t help much, but it is always nice to have more resistance especially in early game, use your basic attack!");
                bundle.putString("skill2","Fires an attack wave in a specified direction, dealing 350 pts of physical damage to the enemy and lowers the enemy’s movement speed 65%, lasting 2s.\n" +
                        "\n" +
                        "-This ability is mainly for harassing and minor crowd control, helps chasing/finishing an low life enemy too.\n" +
                        "\n" +
                        "-Always manually aim! (Drag the ability and aim)");
                bundle.putString("skill3","Rushes in a specified direction and collides with the enemy, dealing 0 pts of physical damage. If the skill hits the target by success, the hero can launch a second-stage attack, dealing 180 pts of physical damage and knocking the enemy airborne.\n" +
                        "\n" +
                        "-The first dash doesn’t deal any physical damage, only the 2nd attack that knocks up the enemy.\n" +
                        "\n" +
                        "-Always manually aim!\n" +
                        "\n" +
                        "-There is a minor text error in the ability, you DON’T HAVE TO hit a target to enable the 2nd attack.\n" +
                        "\n" +
                        "-You can use this ability to push your enemy to your team, or the turret. Combo well with your ultimate and flicker.");
                bundle.putString("skill4","Forcefully thrusts his sword into the earth, pulling surrounding enemies to himself, dealing 270 pts of physical damage to them and stunning them for 1.5s.\n" +
                        "\n" +
                        "-Your main initiating ability.\n" +
                        "\n" +
                        "-Works extremely well with flicker.\n" +
                        "\n" +
                        "-Try it in game and get used with the Area of Effect radius\n" +
                        "\n" +
                        "– Use this skill carefully! It might impacts a lot in teamfight.");
                fragmentt.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragmentt);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        FrameLayout flakai = (FrameLayout) rootView.findViewById(R.id.main2);
        flakai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentHeroContent fragmentt = new FragmentHeroContent();
                Bundle bundle = new Bundle();
                bundle.putString("name","Akai\n" + "(32000bp / 500Diamonds)");
                bundle.putString("intro", "A clumsy panda from a far away Eastern villages dreams every night of becoming a mighty warrior. Akai is fat and clumsy even for panda standards and most people say that all he\\'s good for is rolling round. However, this never fazed Akai, as he trained daily, hoping to one day achieve his dreams of becoming a respected warrior. His friends mocked him, his parents discouraged him but Akai persisted. Soon one day, a mysterious old monk took notice of Akai\\'s persistance and took him under his guidance. Akai flourished under the training of the monk, mastering the arts of the flail. He is now ready to enter the world stage and prove that he is a worthy member of the martial world!");
                bundle.putString("image1","akai");
                bundle.putString("imagestat","akaistat");
                bundle.putString("itembuild","akaiitembuild");
                bundle.putString("skillbuild","akaiskillbuild");
                bundle.putString("images1","akai1");
                bundle.putString("images2","akai2");
                bundle.putString("images3","akai3");
                bundle.putString("images4","akai4");
                bundle.putString("skill11","TAI CHI");
                bundle.putString("skill111","Passive");
                bundle.putString("skill22","THOUSAND POUNDER");
                bundle.putString("skill222","Cooldown 11  Mana Cost 70");
                bundle.putString("skill33","BLENDER");
                bundle.putString("skill333","Cooldown 8.5  Mana Cost 70");
                bundle.putString("skill44","WIND DANCE");
                bundle.putString("skill444","Cooldown 40  Mana Cost 120");
                bundle.putString("skill1","Every time Akai casts a spell, he will receive a shield that on top of his maximum health that blocks a percentage of damage taken, this effect will go on cooldown after the last shield for a set amount of time.");
                bundle.putString("skill2","Jump into the target area, dealing 170 Physical Damage to enemies when landing and a 55% slow down effect. For the next 3s, the following basic attacks will deal an extra 50% Physical Damage.");
                bundle.putString("skill3","Fires a shock wave at the enemy, shock wave will explode on contact with the enemy or once it reaches maximum range, dealing physical damage, marking enemies; basic attacks on marked targets get a percentage of Akai's maximum health as extra physical damage.");
                bundle.putString("skill4","Spins like a tornado for a period of time. Each collision will knock back the target and deal magic damage. During this process, the hero is immune to slow down effects, and casting this ability will remove any negative effects from the hero. Movement speed will be increased for the duration of the skill.");
                fragmentt.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragmentt);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        FrameLayout fltig = (FrameLayout) rootView.findViewById(R.id.main3);
        fltig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentHeroContent fragmentt = new FragmentHeroContent();
                Bundle bundle = new Bundle();
                bundle.putString("name","Tigreal\n" + "(6500bp / 299diamonds)");
                bundle.putString("intro", "In every battle, the mystic warrior Tigreal always fought in the front line and never suffered defeat. Even the vilest of enemies did not dare to challenge Tigreal on the battlefield, because they knew such a foolish action would only be met with Tigreal\\'s merciless blade. The name of Tigreal, a believer in the Lord of Light, has become synonymous with bravery and fearlessness. His kingdom has conferred upon him the honorable title of Warrior of Light as a reward.");
                bundle.putString("image1","tigreal");
                bundle.putString("imagestat","tigrealstat");
                bundle.putString("itembuild","tigrealitembuild");
                bundle.putString("skillbuild","tigrealskillbuild");
                bundle.putString("images1","tigreal1");
                bundle.putString("images2","tigreal2");
                bundle.putString("images3","tigreal3");
                bundle.putString("images4","tigreal4");
                bundle.putString("skill11","FEARLESS");
                bundle.putString("skill111","Passive");
                bundle.putString("skill22","ATTACK WAVE");
                bundle.putString("skill222","Cooldown 9.5  Mana Cost 80");
                bundle.putString("skill33","SACRED HAMMER");
                bundle.putString("skill333","Cooldown 12.5  Mana Cost 110");
                bundle.putString("skill44","IMPLOSION");
                bundle.putString("skill444","Cooldown 36  Mana Cost 120");
                bundle.putString("skill1","Each attack increases his physical and magic defense 3 pts, stacking up to 10 times.");
                bundle.putString("skill2","Fires an attack wave in a specified direction, dealing 300 pts of Physical Damage to the enemy and lowers the enemy's movement speed 50%, lasting 2s.");
                bundle.putString("skill3","Rushes in a specified direction and collides with the enemy, dealing 180 pts of Physical Damage. If the hit dealt by success, the hero can launch a second stage attack, dealing 180 pts of Physical Damage and knocking the enemy airborne.");
                bundle.putString("skill4","Forcefully thrusts his sword into the earth, pulling surrounding enemies to himself and dealing 340 pts of Physical Damage and stunning them for 1.5s.");
                fragmentt.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragmentt);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }});

            return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void OnLogout(){


        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }
}
