package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.lab4.MainActivity.listeNom;

public class Modification extends AppCompatActivity {
    Button confirm;
    static EditText logoName1,logoName2, logoName3, logoName4, logoName5, logoName6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification);


        confirm = (Button) findViewById(R.id.btnConfirm);
        logoName1 = (EditText) findViewById(R.id.logoName1);
        logoName2 = (EditText) findViewById(R.id.logoName2);
        logoName3 = (EditText) findViewById(R.id.logoName3);
        logoName4 = (EditText) findViewById(R.id.logoName4);
        logoName5 = (EditText) findViewById(R.id.logoName5);
        logoName6 = (EditText) findViewById(R.id.logoName6);
        confirm = (Button) findViewById(R.id.btnConfirm);

        logoName1.setText(listeNom[0]);
        logoName2.setText(listeNom[1]);
        logoName3.setText(listeNom[2]);
        logoName4.setText(listeNom[3]);
        logoName5.setText(listeNom[4]);
        logoName6.setText(listeNom[5]);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onConfirm(v);
            }
    });


}
    public void onConfirm (View view){
        if (listeNom[0] != logoName1.getText().toString())
            listeNom[0] = logoName1.getText().toString();
        if (listeNom[1] != logoName2.getText().toString())
            listeNom[1] = logoName2.getText().toString();
        if (listeNom[2] != logoName3.getText().toString())
            listeNom[2] = logoName3.getText().toString();
        if (listeNom[3] != logoName4.getText().toString())
            listeNom[3] = logoName4.getText().toString();
        if (listeNom[4] != logoName5.getText().toString())
            listeNom[4] = logoName5.getText().toString();
        if (listeNom[5] != logoName6.getText().toString())
            listeNom[5] = logoName6.getText().toString();

       /* Intent intent = new Intent(getApplicationContext(), Modification.class);
        startActivityForResult(intent, 0);*/

    }
}