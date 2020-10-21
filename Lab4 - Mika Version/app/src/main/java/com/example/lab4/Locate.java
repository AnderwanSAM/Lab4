package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import static com.example.lab4.MainActivity.listeNom;
public class Locate extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6;
    TextView t1,t2, t3, t4, t5, t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate);

        i1 = (ImageView) findViewById(R.id.image1);
        i2 = (ImageView) findViewById(R.id.image2);
        i3 = (ImageView) findViewById(R.id.image3);
        i4 = (ImageView) findViewById(R.id.image4);
        i5 = (ImageView) findViewById(R.id.image5);
        i6 = (ImageView) findViewById(R.id.image6);

        t1 = (TextView) findViewById(R.id.adresse1);
        t2 = (TextView) findViewById(R.id.adresse2);
        t3 = (TextView) findViewById(R.id.adresse3);
        t4 = (TextView) findViewById(R.id.adresse4);
        t5 = (TextView) findViewById(R.id.adresse5);
        t6 = (TextView) findViewById(R.id.adresse6);

        t1.setText(listeNom[0]);
        t2.setText(listeNom[1]);
        t3.setText(listeNom[2]);
        t4.setText(listeNom[3]);
        t5.setText(listeNom[4]);
        t6.setText(listeNom[5]);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t1);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t2);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t3);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t4);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t5);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v,t6);
            }
        });

    }

    public void OnSetAvatarButton(View view, TextView t){

        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" +t.getText());

        Intent mapIntent = new  Intent(Intent.ACTION_VIEW, gmmIntentUri);

        mapIntent.setPackage("com.google.android.apps.maps");

        startActivity(mapIntent);
    }
}