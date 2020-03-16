package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PoemDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_display);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String poem = Game.AhmedPoem(name);
        //display the messages in a TextView
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(poem);
    }

}
