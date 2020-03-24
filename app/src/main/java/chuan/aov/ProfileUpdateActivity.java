package chuan.aov;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import butterknife.ButterKnife;




public class ProfileUpdateActivity extends AppCompatActivity {
    private static final String TAG = "ProfileUpdateActivity";
    EditText _nameText;
    TextView _emailText;
    EditText _reEnterPasswordText;
    EditText _passwordText;
    EditText _passwordoldText;
    EditText _gameId;
    Spinner _spinner;
    Spinner _spinner2;
    Button _signupButton;
    TextView _loginLink;
    TextView _guildText;
    String name,email,password,guild,role,rank,position,gameid,click;

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(ProfileUpdateActivity.this,ProfileActivity.class);
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
        ProfileUpdateActivity.this.startActivity(intentt);
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);
        ButterKnife.bind(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

        this.name = name;
        this.email = email;
        this.password = password;
        this.guild = guild;
        this.role = role;
        this.rank = rank;
        this.position = position;
        this.gameid = gameid;
        this.click = click;

        Button _signupButton = (Button) findViewById(R.id.btn_signup2);
        TextView _loginLink = (TextView) findViewById(R.id.link_login2);
        EditText _nameText = (EditText) findViewById(R.id.etName2);
        EditText _gameId = (EditText) findViewById(R.id.input_Gameid2);
        TextView _emailText = (TextView) findViewById(R.id.etEmail2);
        EditText _passwordText = (EditText) findViewById(R.id.etPassword2);
        Spinner _spinner = (Spinner) findViewById(R.id.spinner2);
        Spinner _spinner2 = (Spinner) findViewById(R.id.spinnerhero2);
        EditText _guildText = (EditText) findViewById(R.id.input_Guild2);
        EditText _passwordoldText = (EditText) findViewById(R.id.etPassword3);
        EditText _reEnterPasswordText = (EditText) findViewById(R.id.input_reEnterPassword2);
        this._nameText = _nameText;
        this._emailText = _emailText;
        this._passwordText = _passwordText;
        this._spinner = _spinner;
        this._spinner2 = _spinner2;
        this._guildText = _guildText;
        this._reEnterPasswordText = _reEnterPasswordText;
        this._signupButton = _signupButton;
        this._passwordoldText = _passwordoldText;
        this._gameId = _gameId;

        _nameText.setText(name);
        _emailText.setText(email);
        _guildText.setText(guild);
        _gameId.setText(gameid);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner2);

        final Spinner spinnerr = (Spinner) findViewById(R.id.spinnerhero2);

        String compareValue = rank;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        if (!compareValue.equals(null)) {
            int spinnerPosition = adapter.getPosition(compareValue);
            spinner.setSelection(spinnerPosition);
        }

        String compareValue2 = role;
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.country_arrayss, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerr.setAdapter(adapter2);
        if (!compareValue2.equals(null)) {
            int spinnerPosition = adapter2.getPosition(compareValue2);
            spinnerr.setSelection(spinnerPosition);
        }

        _signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        _loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileUpdateActivity.this,ProfileActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("rank", rank);
                intent.putExtra("password", password);
                intent.putExtra("guild", guild);
                intent.putExtra("role", role);
                intent.putExtra("position", position);
                intent.putExtra("gameid", gameid);
                intent.putExtra("click", click);
                ProfileUpdateActivity.this.startActivity(intent);
            }
        });
    }

    public void onSignupSuccess() {
        _signupButton.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public void signup() {
        Log.d(TAG, "Signup");

        if (!onNetworkSuccess()) {
            onNetworkFailed();
            return;
        }

        else if (!validate()) {
            onSignupFailed();
            return;
        }

        _signupButton.setEnabled(true);

        final ProgressDialog progressDialog = new ProgressDialog(this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Updating Account...");
        progressDialog.show();

        final String name2 = _nameText.getText().toString();
        final String password2 = _passwordText.getText().toString();
        final String rank2 = _spinner.getSelectedItem().toString();
        final String role2 = _spinner2.getSelectedItem().toString();
        final String guild2 = _guildText.getText().toString();
        final String game2 = _gameId.getText().toString();
        final String reEnterPassword = _reEnterPasswordText.getText().toString();

        // TODO: Implement your own signup logic here.

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        Intent intent = new Intent(ProfileUpdateActivity.this,ProfileActivity.class);
                        intent.putExtra("name", name2);
                        intent.putExtra("email", email);
                        intent.putExtra("rank", rank2);
                        intent.putExtra("password", password2);
                        intent.putExtra("guild", guild2);
                        intent.putExtra("role", role2);
                        intent.putExtra("position",position);
                        intent.putExtra("gameid", game2);
                        intent.putExtra("click", click);
                        ProfileUpdateActivity.this.startActivity(intent);

                        Toast.makeText(getBaseContext(), "Update successful !", Toast.LENGTH_SHORT).show();

                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileUpdateActivity.this);
                        builder.setMessage("Email Address registered before , please use another email address !")
                                .setOnCancelListener(null)
                                .create()
                                .show();

                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        Intent intent = new Intent(ProfileUpdateActivity.this,ProfileActivity.class);
                                        intent.putExtra("name", name);
                                        intent.putExtra("email", email);
                                        intent.putExtra("rank", rank);
                                        intent.putExtra("password", password);
                                        intent.putExtra("guild", guild);
                                        intent.putExtra("role", role);
                                        intent.putExtra("position", position);
                                        intent.putExtra("gameid", gameid);
                                        intent.putExtra("click", click);
                                        ProfileUpdateActivity.this.startActivity(intent);
                                    }
                                }, 1500);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        UpdateRequest registerRequest = new UpdateRequest(name2,email,rank2,guild2,role2,password2,game2,responseListener);
        RequestQueue queue = Volley.newRequestQueue(ProfileUpdateActivity.this);
        queue.add(registerRequest);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Update failed", Toast.LENGTH_SHORT).show();

        _signupButton.setEnabled(true);
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

        _signupButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String password2 = password;
        String passwordold = _passwordoldText.getText().toString();;
        String name = _nameText.getText().toString();
        String guild = _guildText.getText().toString();
        String password = _passwordText.getText().toString();
        String reEnterPassword = _reEnterPasswordText.getText().toString();
        String gameid = _gameId.getText().toString();

        if(!(passwordold.equals(password2)))
        {
            _passwordoldText.setError("Old password is incorrect");
            valid = false;
        } else {
            _passwordoldText.setError(null);
        }

        if (gameid.isEmpty() || gameid.length() < 5 || gameid.length() > 20) {
            _gameId.setError("Between 5 and 20 alphanumeric characters");
            valid = false;
        } else {
            _gameId.setError(null);
        }

        if (name.isEmpty() || name.length() < 1 || name.length() > 50) {
            _nameText.setError("Between 1 and 50 alphanumeric characters");
            valid = false;
        } else {
            _nameText.setError(null);
        }

        if (guild.isEmpty() || guild.length() < 1 || guild.length() > 150) {
            _guildText.setError("Between 1 and 150 alphanumeric characters");
            valid = false;
        } else {
            _guildText.setError(null);
        }

        if (password.isEmpty() || password.length() < 3 || password.length() > 50) {
            _passwordText.setError("Between 3 and 50 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        if (reEnterPassword.isEmpty() || reEnterPassword.length() < 3 || reEnterPassword.length() > 50 || !(reEnterPassword.equals(password))) {
            _reEnterPasswordText.setError("Password Do not match");
            valid = false;
        } else {
            _reEnterPasswordText.setError(null);
        }

        return valid;
    }


}