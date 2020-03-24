package chuan.aov;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.net.Uri;

public class MenuActivity extends AppCompatActivity
        implements
        FragmentMain.OnFragmentInteractionListener,
        FragmentHeroes.OnFragmentInteractionListener,
        FragmentGuideContent.OnFragmentInteractionListener,
        FragmentHeroContent.OnFragmentInteractionListener,
        NavigationView.OnNavigationItemSelectedListener {
    String name , rank , email , password , guild , role , position , gameid , click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FragmentMain fragmentt = new FragmentMain();
        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        bundle.putString("email",email);
        bundle.putString("rank",rank);
        bundle.putString("guild",guild);
        bundle.putString("role",role);
        bundle.putString("password",password);
        bundle.putString("position",position);
        bundle.putString("gameid",gameid);
        bundle.putString("click",click);
        fragmentt.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragmentt);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        Menu nav_Menu = navigationView.getMenu();
        nav_Menu.findItem(R.id.nav_report).setVisible(false);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String rank = intent.getStringExtra("rank");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String guild = intent.getStringExtra("guild");
        String role = intent.getStringExtra("role");
        String position = intent.getStringExtra("position");
        String gameid = intent.getStringExtra("gameid");
        String click = intent.getStringExtra("click");

        this.name = name;
        this.rank = rank;
        this.email = email;
        this.password = password;
        this.guild = guild;
        this.role = role;
        this.position = position;
        this.gameid = gameid;
        this.click = click;

        if(name != null && position.equals("Admin"))
        {
            nav_Menu.findItem(R.id.nav_report).setVisible(true);
        }

        if(name != null)
        {
            NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view);
            View headerView = navigationView2.getHeaderView(0);
            TextView tvName = (TextView) headerView.findViewById(R.id.tvName);
            TextView tvEmail = (TextView) headerView.findViewById(R.id.tvEmail);
            ImageView img = (ImageView) headerView.findViewById(R.id.imageView);
            tvEmail.setText(email);
            tvName.setText(name);
            img.setImageDrawable(getResources().getDrawable(R.drawable.elite3));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view);
        navigationView2.setNavigationItemSelectedListener(this);
    }

    public static FragmentMain newInstance(String param1, String param2) {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();
        args.putString("param1", "123");
        args.putString("param2", "234");
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onBackPressed() {
        FragmentMain fragmentt = new FragmentMain();
        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        bundle.putString("email",email);
        bundle.putString("rank",rank);
        bundle.putString("guild",guild);
        bundle.putString("role",role);
        bundle.putString("password",password);
        bundle.putString("position",position);
        bundle.putString("gameid",gameid);
        bundle.putString("click",click);
        fragmentt.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragmentt);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent intent = new Intent(MenuActivity.this,MainActivity.class);
            MenuActivity.this.startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_profile) {
            if(name != null) {
                Intent intent = new Intent(MenuActivity.this,ProfileActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                MenuActivity.this.startActivity(intent);
            }
            else
            {
                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                MenuActivity.this.startActivity(intent);
            }



        }
        if (id == R.id.nav_camera) {
            FragmentMain fragmentt = new FragmentMain();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_frame,fragmentt);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MenuActivity.this,GuidesActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);

        } else if (id == R.id.nav_hero) {
            Intent intent = new Intent(MenuActivity.this,HeroesActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);

        } else if (id == R.id.nav_report) {
            Intent intent = new Intent(MenuActivity.this,ReportActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);

        } if (id == R.id.nav_magage) {
            Intent intent = new Intent(MenuActivity.this,ItemsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/mobilelegendslab/"));
            startActivity(intent);

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCCL7FqEho-DaFYyCeTHI5nQ/"));
            startActivity(intent);

        } else if (id == R.id.nav_popular) {
            Intent intent = new Intent(MenuActivity.this,PopularActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);

        }else if (id == R.id.nav_qrcode) {
            Intent intent = new Intent(MenuActivity.this,ScanQrCodeActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);
        }else if (id == R.id.nav_purchase) {
            Intent intent = new Intent(MenuActivity.this,PurchaseActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("rank", rank);
            intent.putExtra("password", password);
            intent.putExtra("guild", guild);
            intent.putExtra("role", role);
            intent.putExtra("position", position);
            intent.putExtra("gameid", gameid);
            intent.putExtra("click", click);
            MenuActivity.this.startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
