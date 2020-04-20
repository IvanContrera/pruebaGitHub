package com.ivanovic.ll.pruebagithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        float suma = sumar(5,9);
    }

    public float sumar(a,b)
    {
        return a+b;
    }

    public double restar()
    {
        return 23.6;
    }
}
