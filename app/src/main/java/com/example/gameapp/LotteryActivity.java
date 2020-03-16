package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LotteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery);
    }
    public void lottery(View view){
        Intent intent = new Intent(this, PoemDisplay.class);
        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);
        EditText editText3 = (EditText) findViewById(R.id.num3);
        int message1 = editText1.getInputType();
        int message2 = editText2.getInputType();
        int message3 = editText3.getInputType();
        intent.putExtra("num1", message1);
        intent.putExtra("num2", message2);
        intent.putExtra("num3", message3);
        startActivity(intent);
    }
}
