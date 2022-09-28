package com.example.logtest;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("MainActivity", "create");
    }

    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity", "start");

    }

    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","restart");

    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","resume");

    }

    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","pause");

    }

    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","stop");

    }

    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","destroy");

    }
}