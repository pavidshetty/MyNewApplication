package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;


import android.os.Bundle;

public class ViewPostItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post_item);
        this.setTitle("Your Item Has Been Posted!");
    }
}
