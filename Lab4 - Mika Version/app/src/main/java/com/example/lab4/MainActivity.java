package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

   public static String [] listeNom = new String[6];

    Button Modificator;
    ImageView avatar;
    EditText logoName1, logoName2, logoName3, logoName4, logoName5, logoName6;
    Button confirm, localiser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listeNom[0] = "nothing";
        Modificator = (Button) findViewById(R.id.Modificator);
        avatar = (ImageView) findViewById(R.id.avatar);
        logoName1 = (EditText) findViewById(R.id.logoName1);
        logoName2 = (EditText) findViewById(R.id.logoName2);
        logoName3 = (EditText) findViewById(R.id.logoName3);
        logoName4 = (EditText) findViewById(R.id.logoName4);
        logoName5 = (EditText) findViewById(R.id.logoName5);
        logoName6 = (EditText) findViewById(R.id.logoName6);
        confirm = (Button) findViewById(R.id.btnConfirm);
        localiser = (Button) findViewById(R.id.localiser) ;

        //listeNom[0] = "Patate";


        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v);

            }
        });

        Modificator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onModificatorListener(v);
            }
        });
       localiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localiser(v);
            }
        });

    }

        public void onOpenInGoogleMaps(View view){
            EditText adresse = (EditText) findViewById(R.id.adresse);

            Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" +adresse.getText());

            Intent mapIntent = new  Intent(Intent.ACTION_VIEW, gmmIntentUri);

            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);
        }

        public void OnSetAvatarButton(View view){

        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult(intent,0);
        }

        public void onModificatorListener(View view){

        Intent intent = new Intent(getApplicationContext(), Modification.class);
        startActivityForResult(intent, 0);
        }

       public  void localiser(View view){
        Intent intent = new Intent(getApplicationContext(), Locate.class);
        startActivityForResult(intent,0);
       }

    }
