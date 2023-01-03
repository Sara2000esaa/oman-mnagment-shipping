package com.example.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Crew extends AppCompatActivity {
Button but2, bu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crew);

        but2=(Button) findViewById(R.id.b111);
        bu1=(Button) findViewById(R.id.b222);


        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(Crew.this,details.class);
                startActivity(second);
            }
        });
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(Crew.this,MainActivity2.class);
                startActivity(second);

            }
        });
    }
}