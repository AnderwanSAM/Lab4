package com.example.gestionnairedeprofils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
public  ImageView log1;
public ImageView log2;
public ImageView log3;
public ImageView log4;
public ImageView log5;
public ImageView log6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        log1 = (ImageView)findViewById(R.id.avatar1);
        log2 = (ImageView)findViewById(R.id.avatar2);
        log3 = (ImageView)findViewById(R.id.avatar3);
        log4 = (ImageView)findViewById(R.id.avatar4);
        log5 = (ImageView)findViewById(R.id.avatar5);
        log6 = (ImageView)findViewById(R.id.avatar6);

        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        log3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        log4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        log5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        log6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });



    }

    public void SetTeamIcon (View view)
    {
        Intent returnIntent = new Intent();

        ImageView selectedImage = (ImageView) view;

        returnIntent.putExtra("ImageID",selectedImage.getId());
        setResult(RESULT_OK,returnIntent);

        finish();

    }
}