package com.example.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Officer extends AppCompatActivity {
Button bb11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer);
bb11=(Button) findViewById(R.id.submit_button);
bb11.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(Officer.this, "SUPMIT SUCCESSFUL", Toast.LENGTH_LONG).show();
    }
});

    }
}