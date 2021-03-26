package com.example.viewmyquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.viewmyquotes.view.Happy;
import com.example.viewmyquotes.view.Inspirational;
import com.example.viewmyquotes.view.Success;

public class MainActivity extends AppCompatActivity {

    Button succes, inspi, happy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        succes = findViewById(R.id.bsucces);
        inspi = findViewById(R.id.binspi);
        happy = findViewById(R.id.bhappy);

        succes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Success.class);
                startActivity(intent);
            }
        });
        inspi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Inspirational.class);
                startActivity(intent);
            }
        });
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Happy.class);
                startActivity(intent);
            }
        });

    }
}