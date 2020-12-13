package com.example.PadmaeB5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kel_anak2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_anak2);

        Button gian = findViewById(R.id.gian);
        gian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kel_anak2.this, gianwirdasatria.class);
                startActivity(intent);
            }
        });

        Button ifa = findViewById(R.id.ifa);
        ifa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kel_anak2.this, syarifaadharani.class);
                startActivity(intent);
            }
        });

        Button kalea = findViewById(R.id.kalea);
        kalea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kel_anak2.this, kaleanara.class);
                startActivity(intent);
            }
        });
    }
}