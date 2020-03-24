package chuan.aov;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ScanQrCodeActivity extends AppCompatActivity {
    private Button scan_btn;
    private Button search_btn;

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(ScanQrCodeActivity.this,MenuActivity.class);
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

        ScanQrCodeActivity.this.startActivity(intentt);
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

        return intentt;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr_code);
        scan_btn = (Button) findViewById(R.id.scan_btn);
        search_btn = (Button) findViewById(R.id.btn_search);

        final Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scanning...");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();
            }
        });

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText _addressText = (EditText) findViewById(R.id.purchasee);

                String address = _addressText.getText().toString();

                if(address.isEmpty() || address.length() < 1 ) {
                    _addressText.setError("Email Address cannot be empty");
                    Toast.makeText(getBaseContext(), "Search failed", Toast.LENGTH_SHORT).show();
                    return;
                } else{
                    _addressText.setError(null);
                }

                if (!onNetworkSuccess()) {
                    Toast.makeText(getBaseContext(), "Please enable network connection for comments", Toast.LENGTH_SHORT).show();
                    return;
                }
                _addressText.setEnabled(true);

                Toast.makeText(getBaseContext(), address,Toast.LENGTH_SHORT).show();

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


                Intent intent2 = new Intent(ScanQrCodeActivity.this, QrCodeProfileActivity.class);
                intent2.putExtra("email2", address);
                intent2.putExtra("name", name);
                intent2.putExtra("email", email);
                intent2.putExtra("rank", rank);
                intent2.putExtra("password", password);
                intent2.putExtra("guild", guild);
                intent2.putExtra("role", role);
                intent2.putExtra("position", position);
                intent2.putExtra("gameid", gameid);
                intent2.putExtra("click", click);

                ScanQrCodeActivity.this.startActivity(intent2);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){
                Toast.makeText(this, "Scan cancelled", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, result.getContents(),Toast.LENGTH_SHORT).show();

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


                Intent intent2 = new Intent(ScanQrCodeActivity.this, QrCodeProfileActivity.class);
                intent2.putExtra("email2", result.getContents());
                intent2.putExtra("name", name);
                intent2.putExtra("email", email);
                intent2.putExtra("rank", rank);
                intent2.putExtra("password", password);
                intent2.putExtra("guild", guild);
                intent2.putExtra("role", role);
                intent2.putExtra("position", position);
                intent2.putExtra("gameid", gameid);
                intent2.putExtra("click", click);

                ScanQrCodeActivity.this.startActivity(intent2);
            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
