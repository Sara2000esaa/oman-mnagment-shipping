package com.example.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class details extends AppCompatActivity {
    EditText edit1, edit2, edit3, edit4;
    Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        edit3=(EditText) findViewById(R.id.edit3);
        edit4=(EditText) findViewById(R.id.edit4);
        submit_button=(Button) findViewById(R.id.submit_button);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second= new Intent(details.this,Crew.class);
                startActivity(second);
                Toast.makeText(details.this, "SUPMIT SUCCESSFUL", Toast.LENGTH_LONG).show();
            }
        });
    }
}