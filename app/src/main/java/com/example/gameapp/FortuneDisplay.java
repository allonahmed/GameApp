package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FortuneDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune_display);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String fort = Game.AhmedFortune(name);
        //display the messages in a TextView
        TextView tv = (TextView) findViewById(R.id.textView3);
        tv.setText(fort);
    }
}
