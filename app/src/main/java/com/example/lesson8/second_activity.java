package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("key1");
        if (findViewById(R.id.text_view)instanceof TextView){
            ((TextView)findViewById(R.id.text_view)).setText(text);
        }
        Log.d("shamal", "onCreate: SecondActivity");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart: SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume: SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause: SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop:SecondActivity ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart:SecondActivity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy: SecondActivity");
    }
}
