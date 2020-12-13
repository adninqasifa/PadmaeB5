package com.example.PadmaeB5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout main = findViewById(R.id.main);
        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Button familytree = findViewById(R.id.familytree);
        familytree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, familytree.class);
                startActivity(intent);
            }
        });

        ImageView logo = findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);
            }
        });

        audio = MediaPlayer.create(this, R.raw.bg);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();
    }

    public void onToggleClicked(View view){
        boolean on =((ToggleButton) view).isChecked();

        if (on){
            audio.setVolume(0,0);
        }
        else{
            audio.setVolume(1,1);
        }
    }

    public void onBackPressed(){
        audio.stop();
        MainActivity.this.finish();
    }
}