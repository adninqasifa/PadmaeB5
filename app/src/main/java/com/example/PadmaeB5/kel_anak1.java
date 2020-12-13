package com.example.PadmaeB5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kel_anak1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_anak1);

        Button adnin = findViewById(R.id.adnin);
        adnin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kel_anak1.this, adninqasifa.class);
                startActivity(intent);
            }
        });

        Button kartika = findViewById(R.id.kartika);
        kartika.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kel_anak1.this, kartikaprabawati.class);
                startActivity(intent);
            }
        });
    }
}