package com.example.e_lib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void e_book (View v){
        Intent i = new Intent(this, eBookActivity.class);
        startActivity(i);
    }
    public void ssc (View v){
        Intent i = new Intent(this, eBookActivity.class);
        startActivity(i);
    }
}