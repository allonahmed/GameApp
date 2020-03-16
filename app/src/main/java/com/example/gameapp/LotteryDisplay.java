package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LotteryDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_display);
        Intent intent = getIntent();
        int message1 = intent.getIntExtranum1);
        String name = intent.getStringExtra("name");
        String poem = Game.AhmedLottery(message1, message2, message3);
        //display the messages in a TextView
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(poem);
    }

}
