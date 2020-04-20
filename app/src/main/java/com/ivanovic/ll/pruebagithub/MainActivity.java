package com.ivanovic.ll.pruebagithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        float suma = sumar();
    }

    public float sumar()
    {
        return 2+3;
    }
}
