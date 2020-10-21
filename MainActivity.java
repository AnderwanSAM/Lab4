package com.example.gestionnairedeprofils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private Button ouvrir;
private ImageView logo ;
static public String [] Adresses = new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ouvrir = (Button)findViewById(R.id.btnMap);
        logo = (ImageView)findViewById(R.id.avatar);

        ouvrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnOpenInGoogleMaps(v);
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v);

            }
        });


    }

    public void OnOpenInGoogleMaps(View view)
    {
        EditText teamAdres = (EditText)findViewById(R.id.etAdress);
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAdres.getText());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);

        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void OnSetAvatarButton(View view)
    {
        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;

        ImageView avatarImage = (ImageView) findViewById(R.id.avatar);
        String drawableName = "ic_logo_00";
        switch (data.getIntExtra("ImageID",R.id.avatar1))
        {
            case R.id.avatar1:
                drawableName ="ic_logo_01";
                break;
            case R.id.avatar2:
                drawableName = "ic_logo_02";
                break;
            case R.id.avatar3 :
                drawableName = "ic_logo_03";
                break;
            case R.id.avatar4:
                drawableName = "ic_logo_04";
                break;
            case R.id.avatar5:
                drawableName = "ic_logo_05";
                break;
            case R.id.avatar6:
                drawableName = "ic_logo_00";
                break ;
            default :
                drawableName = "ic_logo_01";
                break ;
        }
        int resID = getResources().getIdentifier(drawableName,"drawable",getPackageName());
        avatarImage.setImageResource(resID);
    }
}