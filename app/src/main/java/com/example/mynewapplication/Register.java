package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.setTitle("New User? Register here");
    }
    public void regist(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
