package com.example.PadmaeB5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button yan = findViewById(R.id.yan);
        yan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, yanmursal.class);
                startActivity(intent);
            }
        });

        Button silvia = findViewById(R.id.silvia);
        silvia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, silviamaharani.class);
                startActivity(intent);
            }
        });

        Button bttnAnak = findViewById(R.id.bttnAnak);
        bttnAnak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, anak.class);
                startActivity(intent);
            }
        });

        Button bttnCucu = findViewById(R.id.bttnCucu);
        bttnCucu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, cucu.class);
                startActivity(intent);
            }
        });
    }
}