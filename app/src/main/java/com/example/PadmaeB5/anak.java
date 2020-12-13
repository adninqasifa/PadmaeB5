package com.example.PadmaeB5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class anak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anak);

        ImageView adninImageButton = findViewById(R.id.adninImageButton);
        adninImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(anak.this, kel_anak1.class);
                startActivity(intent);
            }
        });

        ImageView ifaImageButton = findViewById(R.id.ifaImageButton);
        ifaImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(anak.this, kel_anak2.class);
                startActivity(intent);
            }
        });
    }
}