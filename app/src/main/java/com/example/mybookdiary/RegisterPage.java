package com.example.mybookdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {

    EditText user, pass, email, confirmPass;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        user = findViewById(R.id.username_reg);
        pass = findViewById(R.id.password_reg);
        confirmPass = findViewById(R.id.confirmpass_reg);
        email = findViewById(R.id.email_reg);
        signUpBtn = findViewById(R.id.sgnUpBtn_reg);

    }
}