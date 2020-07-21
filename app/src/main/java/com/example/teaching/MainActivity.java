package com.example.teaching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        burger = findViewById(R.id.burger_button);
        burger.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == burger){
            Intent intent = new Intent(this,Burger.class);
            startActivity(intent);
        }
    }
}