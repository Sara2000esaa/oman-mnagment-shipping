package com.example.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    Button but1,but2,but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.t1);
        but1=(Button)findViewById(R.id.but1);
        but2=(Button)findViewById(R.id.bt2);
        but3=(Button)findViewById(R.id.but3);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(MainActivity2.this,Cadet.class);
                startActivity(second);
            }

        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(MainActivity2.this,Crew.class);
                startActivity(second);
            }
            });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(MainActivity2.this,Officer.class);
                startActivity(second);
            }
        });
        }


    }

