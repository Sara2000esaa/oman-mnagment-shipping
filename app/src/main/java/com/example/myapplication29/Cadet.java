package com.example.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadet extends AppCompatActivity {
    Button but9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadet);
        but9=(Button) findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(Cadet.this,MainActivity2.class);
                startActivity(second);
            }
        });

    }
}