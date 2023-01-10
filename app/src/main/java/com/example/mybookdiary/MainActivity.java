package com.example.mybookdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button letsStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letsStart = findViewById(R.id.letsStartBtn);

        letsStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Explicit Intent
                Intent i = new Intent(getApplicationContext(), LoginPage.class);
                startActivity(i);

            }
        });
    }
}